# **Buttons That Maintain State**

<br>

***The Swing GUI components contain 3 types of `state buttons`***
+ JToggleButton
+ JCheckBox
+ JRadioButton

<br>


|    | Content |
| -- | ------- |
| 1 | <a href="#01">JCheckBox</a> |
| 2 | <a href="#02">JRadioButton</a> |

<br>

**<h2 id="01">JCheckBox</h2>**

## **Example**

#### ***Code***

#### *class* ***CheckBoxFrame***

```
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
```

#### *class* ***CheckBoxTest***

```
import javax.swing.JFrame;

public class CheckBoxTest {
    public static void main(String[] args) {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(800, 200);
        checkBoxFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_10/CheckBoxTest%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_10/CheckBoxTest%5Bpic2%5D.png)

![](/code/assets/images/java_swing/section09/section09_10/CheckBoxTest%5Bpic3%5D.png)

![](/code/assets/images/java_swing/section09/section09_10/CheckBoxTest%5Bpic4%5D.png)

<br>

**<h2 id="02">JRadioButton</h2>**

## **Example**

#### ***Code***

#### *class* ***RadioButtonFrame***

```
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
    private JTextField textField;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plainJRadioButton, boldJRadioButton, italicJRadioButton, boldItalicJRadioButton;
    private ButtonGroup radioGroup;

    public RadioButtonFrame() {
        super("RadioButton Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 30);
        add(textField);

        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold and Italic", false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);

        plainFont = new Font("Serif", Font.PLAIN, 20);
        boldFont = new Font("Serif", Font.BOLD, 20);
        italicFont = new Font("Serif", Font.ITALIC, 20);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 20);

        textField.setFont(plainFont);
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

    private class RadioButtonHandler implements ItemListener {
        private Font font;

        public RadioButtonHandler(Font f) {
            font = f;
        }

        public void itemStateChanged(ItemEvent event) {
            textField.setFont(font);
        }
    }
}
```

#### *class* ***RadioButtonTest***

```
import javax.swing.JFrame;

public class RadioButtonTest {
    public static void main(String[] args) {
        RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setSize(500, 300);
        radioButtonFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_10/RadioButtonTest%5Bpic1%5D.png)

![](/code/assets/images/java_swing/section09/section09_10/RadioButtonTest%5Bpic2%5D.png)
