# **JButton**

### ***Code & Result***

## ***Swing button hierarchy***
![Swing button hierarchy](/code/assets/images/java_swing/section09/section09_09/SwingButtonHierarchy.png "Swing button hierarchy")

## **Example**

#### *file* ***bug1.png***

![bug1.png](/code/assets/images/java_swing/section09/section09_09/bug1.png "bug1.png")

#### *file* ***bug2.png***

![bug2.png](/code/assets/images/java_swing/section09/section09_09/bug2.png "bug2.png")

#### *class* ***ButtonFrame***

```
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonFrame extends JFrame {
    private JButton plainJButton, fancyJButton;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        ImageIcon bug1 = new ImageIcon(
                "code\\assets\\images\\java_swing\\section09\\section09_09\\bug1.png");
        bug1.setImage(
                bug1.getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE));
        ImageIcon bug2 = new ImageIcon(
                "code\\assets\\images\\java_swing\\section09\\section09_09\\bug2.png");
        bug2.setImage(
                bug2.getImage().getScaledInstance(20, 20, DO_NOTHING_ON_CLOSE));

        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(
                    ButtonFrame.this,
                    String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
```

#### *class* ***ButtonTest***

```
import javax.swing.JFrame;

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(300, 200);
        buttonFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_09/ButtonTest%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_09/ButtonTest%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_09/ButtonTest%5Bpic3%5D.png)