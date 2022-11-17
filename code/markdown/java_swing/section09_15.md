# **Adapter Classes**

## **Example**

### ***Code***

#### *class* ***MouseDetailsFrame***

```
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {
    private String details;
    private JLabel statusBar;

    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");
        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());

    }

    private class MouseClickHandler extends MouseAdapter {
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX();
            int yPos = event.getY();

            details = String.format("Clicked %d time(s)", event.getClickCount());

            if (event.getButton() == MouseEvent.BUTTON3) {
                details += " with right mouse button";
            } else if (event.getButton() == MouseEvent.BUTTON2) {
                details += " with center mouse button";
            } else if (event.getButton() == MouseEvent.BUTTON1) {
                details += " with left mouse button";
            }

            statusBar.setText(details);
        }
    }
}
```

#### *class* ***MouseDetails***

```
import javax.swing.JFrame;

public class MouseDetails {
    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 200);
        mouseDetailsFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_15/MouseDetails%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_15/MouseDetails%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_15/MouseDetails%5Bpic3%5D.png)