# **Color Conntrol**


| Color constant | RGB value |
| -------------- | --------- |
| public final static Color RED | 255, 0, 0 |
| public final static Color GREEN |  0, 255, 0 |
| public final static Color BLUE | 0, 0, 255 |
| public final static Color ORANGE | 255, 200, 0 |
| public final static Color PINK | 255, 175, 175 |
| public final static Color CYAN | 0, 255, 255 |
| public final static Color MAGENTA | 255, 0, 255 |
| public final static Color YELLOW | 255, 255, 0 |
| public final static Color BLACK | 0, 0, 0 | 
| public final static Color WHITE | 255, 255, 255 |
| public final static Color GRAY | 128, 128, 128 |
| public final static Color LIGHT_GRAY | 192, 192, 192 |
| public final static Color DARK_GRAY | 64, 64, 64 |

<br>

## **Example1: Using Color**

### ***Code***

#### *class* ***ColorPanel***

```
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40);

        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);

        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 90);

    }
}
```

#### *class* ***ShowColors***

```
import javax.swing.JFrame;

public class ShowColors {
    public static void main(String[] args) {
        JFrame application = new JFrame("Using Colors");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 180);

        ColorPanel colorPanel = new ColorPanel();
        application.add(colorPanel);
        application.setVisible(true);

    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_03/ShowingColors.png)


<br>

<br>

## **Example2: Using JColorChooser**

### ***Code***

#### *class* ***ShowColor2JFrame***

```
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowColor2JFrame extends JFrame {
    private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;

    public ShowColor2JFrame() {
        super("Using JColorChooser");
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(ShowColor2JFrame.this, "Choose a color", color);
                        if (color == null) {
                            color = Color.LIGHT_GRAY;
                        }
                        colorJPanel.setBackground(color);
                    }
                });

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    }

}
```

#### *class* ***ShowColors2***

```
import javax.swing.JFrame;

public class ShowColors2 {
    public static void main(String[] args) {
        ShowColor2JFrame application = new ShowColor2JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section10/section10_03/ShowColors2%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section10/section10_03/ShowColors2%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section10/section10_03/ShowColors2%5Bpic3%5D.png)
