package Q3.swing.classswing;

import Q3.swing.First.first;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main {

    private JPanel main;
//    private static JLabel lab;
//
//
//    public pain() {
//        lab.setText("Tristan suxxxxxxxxz");
//    }
//
//
//
//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
//
//    public static void main(String[] args) {
//        ImageIcon img = new ImageIcon("images.jfif");
//        JFrame frame = new JFrame("nice");
//        frame.setContentPane(new pain().main);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setIconImage(img.getImage());
//        lab.setIcon(img);
//        frame.setVisible(true);
//
//    }
private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel lab;
    private JProgressBar buttonRadioButton;
    private JButton button5;
    private JButton button6;
    private JLabel mo;
    private JRadioButton radioButton1;
    private static int cooks = 1;
    private static int cnt = 0;
    public static int check = 0;
    private static JPanel Next;

    public main() {

        ImageIcon img = new ImageIcon("images.jfif");
        lab.setIcon(img);
        lab.setSize(1080, 1960);
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("nice");
        ImageIcon img = new ImageIcon("images.jfif");
        frame.setSize(1080, 1960);
        frame.setContentPane(new main().main);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setIconImage(img.getImage());
        frame.setVisible(true);

    }
}
