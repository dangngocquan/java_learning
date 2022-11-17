# **Using Panels to Manager More Complex Layouts**

## **Example**

### ***Code***

#### *class* ***PanelFrame***

```
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
    private JButton[] buttons;
    private JPanel buttonJPanel;

    public PanelFrame() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]);
        }

        add(buttonJPanel, BorderLayout.SOUTH);
    }
}
```

#### *class* ***PanelDemo***

```
import javax.swing.JFrame;

public class PanelDemo {
    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200);
        panelFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_19/PanelDemo.png)