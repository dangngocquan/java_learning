# **JList**

## **Example**

### ***Code***

#### *class* ***ListFrame***

```
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
import java.awt.Color;

public class ListFrame extends JFrame {
    private JList colorJList;
    private static final String[] colorNames = {
            "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"
    };
    private static final Color[] colors = {
            Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW
    };

    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
                    }
                });
    }
}
```

#### *class* ***ListTest***

```
public class ListTest {
    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame();
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(500, 300);
        listFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_12/ListTest%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_12/ListTest%5Bpic2%5D.png)