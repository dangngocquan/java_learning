package code.java.java_swing.section11.section11_05;

import javax.swing.JFrame;

public class PopupTest {
    public static void main(String[] args) {
        PopupFrame popupFrame = new PopupFrame();
        popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popupFrame.setSize(300, 300);
        popupFrame.setVisible(true);
    }
}
