# **Displaying Text and Images Using Labels**

### ***Code & Output***

#### *file* ***Square.png*** 

![Square.png](/code/assets/images/java_swing/section07/Square.png "Square.png")

#### *class* ***LabelDemo*** 
```
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {
    public static void main(String[] args) {
        JLabel northLabel = new JLabel("North");

        ImageIcon labelIcon = new ImageIcon(
                "code\\assets\\images\\java_swing\\section07\\Square.png");

        JLabel centerLabel = new JLabel(labelIcon);

        JLabel southLabel = new JLabel(labelIcon);
        southLabel.setText("South");

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(1000, 700);
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);
        application.setVisible(true);
    }
}
```



#### ***Output***
![LabelDemo](/code/assets/images/java_swing/section07/LabelDemo.png "LabelDemo")