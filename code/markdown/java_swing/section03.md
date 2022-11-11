# **Drawing Rectangles and Ovals**

### ***Code & Output***
#### *class* ***Shapes*** 
```
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
    private int choice;

    public Shapes(int userChoice) {
        this.choice = userChoice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {
            switch (this.choice) {
                case 1:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2:
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}
```

#### *class* ***ShapelTest***
```
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles.\n" +
                        "Enter 2 to draw ovals.");
        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(600, 600);
        application.add(panel);
        application.setVisible(true);
    }
}
```

#### ***Output***
![Output](/code/assets/images/java_swing/section03/ShapesTest%5Bpic1%5D.png "When userChoice = 1")

![Output](/code/assets/images/java_swing/section03/ShapesTest%5Bpic2%5D.png "When userChoice = 1")

![Output](/code/assets/images/java_swing/section03/ShapesTest%5Bpic3%5D.png "When userChoice = 2")

![Output](/code/assets/images/java_swing/section03/ShapesTest%5Bpic4%5D.png "When userChoice = 2")