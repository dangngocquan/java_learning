package code.java.java_swing.section09.section09_13;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultipleSelectionFrame extends JFrame {
    private JList colorJList;
    private JList copyJList;
    private JButton copyJButton;
    private static final String[] colorNames = {
            "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"
    };

    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<>(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                copyJList.setListData(colorJList.getSelectedValuesList().toArray());
            }

        });

        add(copyJButton);

        copyJList = new JList<>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(copyJList));
    }
}
