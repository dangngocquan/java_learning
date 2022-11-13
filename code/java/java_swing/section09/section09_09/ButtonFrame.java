package code.java.java_swing.section09.section09_09;

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