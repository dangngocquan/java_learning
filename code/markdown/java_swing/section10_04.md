# **Manipulating Fonts**

## **1. Font**

| Method or Constants | Description |
| ------------------- | ----------- |
| ***Font constants, constructors and methods*** |
| public final static int PLAIN | A constant representing a plain font style. |
| public final static int BOLD | A constant representing a bold font style. |
| public final static int ITALIC | A constant representing an italic font style. |
| public Font( String name, int style, int size ) | Creates a Font object with the specified font name, style and size. |
| public int getStyle() | Returns an int indicating the current font style. |
| public int getSize() | Returns an int indicating the current font size. |
| public String getName() | Returns the current font name as a string. |
| public String getFamily() | Returns the font’s family name as a string. |
| public boolean isPlain() | Returns true if the font is plain, else false. |
| public boolean isBold() | Returns true if the font is bold, else false. |
| public boolean isItalic() | Returns true if the font is italic, else false. |
| ***Graphics methods for manipulating Fonts*** |
| public Font getFont() | Returns a Font object reference representing the current font. |
| public void setFont( Font f ) | Sets the current font to the font, style and size specified by the Font object reference f. |

## **Example**

### ***Code***

#### *class* ***FontJPanel***

```
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class FontJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Serif", Font.BOLD, 12));
        g.drawString("Serif 12 point bold.", 20, 30);

        g.setFont(new Font("Monospaced", Font.ITALIC, 24));
        g.drawString("Monospaced 24 point italic.", 20, 50);

        g.setFont(new Font("SanSerif", Font.PLAIN, 14));
        g.drawString("SanSerif 14 point plain.", 20, 70);

        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + " point bold italic.", 20, 90);
    }
}
```

#### *class* ***Fonts***

```
import javax.swing.JFrame;

public class Fonts {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(420, 150);

        FontJPanel fontJPanel = new FontJPanel();
        application.add(fontJPanel);
        application.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_04/Fonts.png)


## **2. Font Metrics**

| Method | Description |
| ------ | ----------- |
| ***FontMetrics methods*** |
| public int getAscent() | Returns the ascent of a font in points. |
| public int getDescent() | Returns the descent of a font in points. |
| public int getLeading() | Returns the leading of a font in points. |
| public int getHeight() | Returns the height of a font in points. |
| ***Graphics methods for getting a Font’s FontMetrics*** |
| public FontMetrics getFontMetrics() | Returns the FontMetrics object for the current drawing Font. |
| public FontMetrics getFontMetrics( Font f ) | Returns the FontMetrics object for the specified Font argument. |

## **Example**

### ***Code***

#### *class* ***MetricsJPanel***

```
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MetricsJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        FontMetrics metrics = g.getFontMetrics();
        g.setFont(new Font("SanSerif", Font.BOLD, 12));
        g.drawString("Current Font: " + g.getFont(), 10, 30);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60);
        g.drawString("Height: " + metrics.getHeight(), 10, 75);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90);

        Font font = new Font("Serif", Font.ITALIC, 14);
        metrics = g.getFontMetrics();
        g.setFont(font);
        g.drawString("Current Font: " + g.getFont(), 10, 30 + 90);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45 + 90);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60 + 90);
        g.drawString("Height: " + metrics.getHeight(), 10, 75 + 90);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90 + 90);
    }
}
```

#### *class* ***Metrics***

```
import javax.swing.JFrame;

public class Metrics {
    public static void main(String[] args) {
        JFrame application = new JFrame("Demonstrating FontMetrics");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(510, 240);

        MetricsJPanel metricsJPanel = new MetricsJPanel();
        application.add(metricsJPanel);
        application.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_04/Metrics.png)
