# **Simple GUI-Based Input/Output with JOptionPane**

|   | Content |
| - | ------- |
| 1 | <a href="#01">Example code</a> |
| 2 | <a href="#02">Message Dialog Types</a> |


<br>

**<h2 id="01">Example code and result </h2>**

#### ***Code***
```
import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog(
            "Enter the first integer:");
        String secondNumber = JOptionPane.showInputDialog(
            "Enter the second integer:");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(
            null, String.format("The sum is %d.", sum),
            "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}
```

#### ***Output***

![Enter the first number](/code/assets/images/java_swing/section09/section09_03/Addition%5Bpic1%5D.png "Enter the first number")

<br>

![Enter the second number](/code/assets/images/java_swing/section09/section09_03/Addition%5Bpic2%5D.png "Enter the second number")

<br>

![Show the sum of two integers](/code/assets/images/java_swing/section09/section09_03/Addition%5Bpic3%5D.png "Show the sum of two integers")

<br>

**<h2 id="02">Message Dialog Types </h2>**

![Message Dialog Types](/code/assets/images/java_swing/section09/section09_03/MessageDialogTypes.png "Message Dialog Types")