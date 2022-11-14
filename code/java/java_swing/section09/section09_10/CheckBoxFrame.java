package code.java.java_swing.section09.section09_10;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxFrame extends JFrame {
    private JTextField textField;
    private JCheckBox boldCheckBox, italicCheckBox;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 48));
        add(textField);

        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");
        add(boldCheckBox);
        add(italicCheckBox);

        CheckBoxHandle handle = new CheckBoxHandle();
        boldCheckBox.addItemListener(handle);
        italicCheckBox.addItemListener(handle);
    }

    private class CheckBoxHandle implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 48);
            } else if (boldCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 48);
            } else if (italicCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 48);
            } else {
                font = new Font("Serif", Font.PLAIN, 48);
            }

            textField.setFont(font);
        }
    }
}