# **Key Event Handling**

## **Example**

### ***Code***

#### *class* ***KeyDemoFrame***

```
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private JTextArea textArea;

    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }

    public void keyReleased(KeyEvent event) {
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }

    public void keyTyped(KeyEvent event) {
        line1 = String.format("Key typed: %s", event.getKeyChar());
        setLines2and3(event);
    }

    public void setLines2and3(KeyEvent event) {
        line2 = String.format("This key is %san action key", (event.isActionKey() ? "" : "not "));
        String temp = KeyEvent.getModifiersExText(event.getModifiersEx());

        line3 = String.format("Modifier keys pressed: %s", (temp.equals("") ? "none" : temp));

        textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
    }
}
```

#### *class* ***KeyDemo***

```
import javax.swing.JFrame;

public class KeyDemo {
    public static void main(String[] args) {
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350, 200);
        keyDemoFrame.setVisible(true);
    }
}
```

#### ***Result***

![](/code/assets/images/java_swing/section09/section09_17/KeyDemo%5Bpic1%5D.png)