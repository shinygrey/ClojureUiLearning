package brave3Java;

import javax.swing.*;

public class Home {
    private JPanel panel1;
    private JButton button1;
    public static void main(String[] args){
        JFrame frame = new JFrame("test1");
        frame.setContentPane(new Home().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
