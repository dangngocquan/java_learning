# **JSlider**

## **Example**

### ***Code***

#### *class* ***OvalPanel***

```
import java.awt.Graphics;

import javax.swing.JPanel;

import java.awt.Dimension;

public class OvalPanel extends JPanel {
    private int diameter = 10;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillOval(10, 10, diameter, diameter);
    }

    public void setDiameter(int newDiameter) {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
```

#### *class* ***SliderFrame***

```
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
    private JSlider diameterJSlider;
    private OvalPanel myPanel;

    public SliderFrame() {
        super("Slider Demo");
        myPanel = new OvalPanel();
        myPanel.setBackground(Color.YELLOW);

        diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        diameterJSlider.setMajorTickSpacing(10);
        diameterJSlider.setPaintTicks(true);
        diameterJSlider.addChangeListener(
                new ChangeListener() {
                    public void stateChanged(ChangeEvent event) {
                        myPanel.setDiameter(diameterJSlider.getValue());
                    }
                });

        add(diameterJSlider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
```

#### *class* ***SliderDemo***

```
import javax.swing.JFrame;

public class SliderDemo {
    public static void main(String[] args) {
        SliderFrame sliderFrame = new SliderFrame();
        sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sliderFrame.setSize(220, 270);
        sliderFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section11/section11_02/SliderDemo.png)