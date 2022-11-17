# **Introduction to Layout Managers**

| Layout manager |
| -------------- |
| null |
| FlowLayout |
| BorderLayout |
| GridLayout |

## **FlowLayout**

### ***Code***

#### *class* ***FlowLayoutFrame***

```
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
    private JButton leftJButton, centerJButton, rightJButton;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                });

        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(container);
            }
        });

        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(container);
            }
        });
    }
}
```

#### *class* ***FlowLayoutDemo***

```
import javax.swing.JFrame;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowLayoutFrame.setSize(300, 100);
        flowLayoutFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_18/FlowLayoutDemo%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_18/FlowLayoutDemo%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_18/FlowLayoutDemo%5Bpic3%5D.png)


## **BorderLayout**

### ***Code***

#### *class* ***BorderLayoutFrame***

```
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private static final String[] names = {
            "Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"
    };
    private BorderLayout layout;

    public BorderLayoutFrame() {
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5);
        setLayout(layout);
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent event) {
        for (JButton button : buttons) {
            if (event.getSource() == button) {
                button.setVisible(false);
            } else {
                button.setVisible(true);
            }
        }
        layout.layoutContainer(getContentPane());
    }
}

```

#### *class* ***BorderLayoutDemo***

```
import javax.swing.JFrame;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
}

```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_18/BorderLayoutDemo%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_18/BorderLayoutDemo%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_18/BorderLayoutDemo%5Bpic3%5D.png)

## **GridLayout**

### ***Code***

#### *class* ***GridLayoutFrame***

```
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private static final String[] names = {
            "one", "two", "three", "four", "five", "six"
    };
    private boolean toggle = true;
    private Container container;
    private GridLayout gridLayout1, gridLayout2;

    public GridLayoutFrame() {
        super("GridLayout Demo");
        gridLayout1 = new GridLayout(2, 3, 5, 5);
        gridLayout2 = new GridLayout(3, 2);
        container = getContentPane();
        setLayout(gridLayout1);
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (toggle) {
            container.setLayout(gridLayout2);
        } else {
            container.setLayout(gridLayout1);
        }

        toggle = !toggle;
        container.validate();
    }
}
```

#### *class* ***GridLayoutDemo***

```
import javax.swing.JFrame;

public class GridLayoutDemo {
    public static void main(String[] args) {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setVisible(true);
    }
}

```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_18/GridLayoutDemo%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_18/GridLayoutDemo%5Bpic2%5D.png)

