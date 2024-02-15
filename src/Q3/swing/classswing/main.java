package Q3.swing.classswing;

import Q3.swing.First.first;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main {

    private JPanel main;
    private static JLabel lab;


    public main() {

    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("images.jfif");
        JFrame frame = new JFrame("nice");
        frame.setContentPane(new main().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setIconImage(img.getImage());
        lab.setIcon(img);
        frame.setVisible(true);

    }
}
