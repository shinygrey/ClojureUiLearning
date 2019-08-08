package brave3Java;

import java.awt.*;
import javax.swing.*;

class SwingGui2 extends JFrame {

    private static JFrame frame1;
    private static JButton b, b1, b2, b3;
    private static JLabel label;


    public static void main(String[] args){

        frame1 = new JFrame("panel");

        label = new JLabel("panel label");

        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");
        b3 = new JButton("button4");

        JPanel panel1 = new JPanel();

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        panel1.add(b);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(label);

        panel1.setBackground(Color.gray);

        frame1.add(panel1);
        frame1.setSize(300, 300);
        frame1.setVisible(true);
    }
}