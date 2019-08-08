package brave3Java;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class SwingGui extends JFrame {
    SwingGui(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("Ok", new ImageIcon("bullet.gif"));
        jb.setHorizontalAlignment(SwingConstants.LEFT);
        jb.setMnemonic('O');

        getContentPane().add(jb, BorderLayout.CENTER);

        jb = new JButton("<html><i>Cancel</i></html>");
        jb.setVerticalAlignment(SwingConstants.BOTTOM);

        jb.setDefaultCapable(true);

        getContentPane().add(jb, BorderLayout.EAST);

        getRootPane().setDefaultButton(jb);

        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingGui("Button Demo");
    }
}


/*
import javax.swing.*;
import java.awt.*;

class SwingGui1 {

    private JPanel panel;

    SwingGui1(){
        this.panel = new JPanel();


        panel.setLayout(new GridLayout());
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        panel.setSize(200,200);
        JButton button = new JButton("Press");
        button.setSize(100,50);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setMargin(new Insets(50,50,50,50));
        panel.add(button);

    }

    public static void main(String[] args){
        JFrame frame = new JFrame("My First GUI");
        frame.setContentPane(new SwingGui1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        //frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}
*/
