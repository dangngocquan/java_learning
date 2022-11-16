# **Mouse Event Handling**

## **Example**

### ***Code***

#### *class* ***MouseTrackerFrame***

```
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class MouseTrackerFrame extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;

    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside JLabel");
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at [%d, %d]", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format("Pressed at [%d, %d]", e.getX(), e.getY()));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format("Released at [%d, %d]", e.getX(), e.getY()));

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText(String.format("Mouse outside at [%d, %d]", e.getX(), e.getY()));
            mousePanel.setBackground(Color.WHITE);
        }

    }
}
```

#### *class* ***MouseTracker***

```
import javax.swing.JFrame;

public class MouseTracker {
    public static void main(String[] args) {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(600, 300);
        mouseTrackerFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_14/MouseTracker%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_14/MouseTracker%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_14/MouseTracker%5Bpic3%5D.png)