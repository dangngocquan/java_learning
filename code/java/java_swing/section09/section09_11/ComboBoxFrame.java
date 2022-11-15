package code.java.java_swing.section09.section09_11;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ItemEvent;

public class ComboBoxFrame extends JFrame {
    private JComboBox imagesJComboBox;
    private JLabel label;

    private static final String[] names = {
            "code\\assets\\images\\java_swing\\section09\\section09_11\\goku1.png",
            "code\\assets\\images\\java_swing\\section09\\section09_11\\goku2.png",
            "code\\assets\\images\\java_swing\\section09\\section09_11\\goku3.png",
            "code\\assets\\images\\java_swing\\section09\\section09_11\\goku4.png"
    };

    private Icon[] icons = {
            new ImageIcon(names[0]),
            new ImageIcon(names[1]),
            new ImageIcon(names[2]),
            new ImageIcon(names[3])
    };

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox(names);
        imagesJComboBox.setMaximumRowCount(3);

        imagesJComboBox.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event) {
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                });

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}