# **Displaying Text and Images in a Window**

## **SwingConstant**

| Constant | Description |
| -------- | ----------- |
| ***Horizontal-position constants***
| LEFT | Place text on the left |
| CENTER | Place text in the center |
| RIGHT | Place text on the right |
| ***Vertical-position constants***
| TOP | Place text at the top |
| CENTER | Place text in the center |
| BOTTOM | Place text at the bottom |

<br>

## **Constructor Summary**

| Constructor | Description |
| ----------- | ----------- |
| `JLabel()` | Creates a JLabel instance with no image and with an empty string for the title |
| `JLabel(Icon image)` | Creates a JLabel instance with the specified image |
| `JLabel(Icon image, int horizontalAlignment)` | Creates a JLabel instance with the specified image and horizontal alignment |
| `JLabel(String text)` | Creates a JLabel instance with the specified text |
| `JLabel(String text, Icon icon, int horizontalAlignment)` | Creates a JLabel instance with the specified text, image, and horizontal alignment |
| `JLabel(String text, int  horizontalAlignment)` | Creates a JLabel instance with the specified text and horizontal alignment |

<br>

## **<a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JLabel.html#checkVerticalKey(int,%20java.lang.String)">Method summary</a>**

| Modifier and Type | Method |   |
| ----------------- | ------ | - |
| protected int | `checkHorizontalKey(int key, String message)` |
| protected int | `checkVerticalKey(int key, String message)` |
| AccessibleContext | `getAccessibleContext()` |
| Icon | `getDisabledIcon()` |
| int | `getDisplayedMnemonic()` |
| int | `getDisplayedMnemonicIndex()` |
| int | `getHorizontalAlignment()` | [x]
| int | `getHorizontalTextPosition()` | [x]
| Icon | `getIcon()` | [x]
| int | `getIconTextGap()` | [x]
| Component | `getLabelFor()` |
| String | `getText()` | [x]
| LabelUI | `getUI()` |
| String | `getUIClassID()` |
| int | `getVerticalAlignment()` | [x]
| int | `getVerticalTextPosition()` | [x]
| boolean | `imageUpdate(Image img, int infoflags, int x, int y, int w, int h)` | [x]
| protected String | `paramString()` |
| void | `setDisabledIcon(Icon disabledIcon)` |
| void | `setDisplayedMnemonic(char aChar)` |
| void | `setDisplayedMnemonic(int key)` |
| void | `setDisplayedMnemonicIndex(int index)` |
| void | `setHorizontalAlignment(int alignment)` | [x]
| void | `setHorizontalTextPosition(int textPosition)` | [x]
| void | `setIcon(Icon icon)` | [x]
| void | `setIconTextGap(int iconTextGap)` | [x]
| void | `setLabelFor(Component c)` |
| void | `setText(String text)` | [x]
| void | `setUI(LabelUI ui)` |
| void | `setVerticalAlignment(int alignment)` | [x]
| void | `setVerticalTextPosition(int textPosition)` | [x]
| void | `updateUI()` |


<br> 

## **Example**

### **Code & Result**

#### *file* ***bug.png***

![bug.png](/code/assets/images/java_swing/section09/section09_05/bug.png)

#### *class* ***LabelFrame***

```
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;;

public class LabelFrame extends JFrame {
    private JLabel label1, label2, label3;

    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon bug = new ImageIcon(
                "code\\assets\\images\\java_swing\\section09\\section09_05\\bug.png");
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
```

#### *class* ***LabelTest***

```
import javax.swing.JFrame;

public class LabelTest {
    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(456, 700);
        labelFrame.setVisible(true);
    }
}
```

#### ***Result***

![LabelTest](/code/assets/images/java_swing/section09/section09_05/LabelTest%5Bpic1%5D.png "Label Test")