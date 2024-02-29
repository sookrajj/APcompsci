package Q3.swing.MineSweeper;

import Q3.swing.First.first;

import javax.swing.*;

public class Minesweeper {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JTextArea Score;
    private JLabel timer;
    private JLabel openS;
    private JLabel MinesL;
    public static int[][] mineCheck = new int[6][6];

    public Minesweeper() {
        for (int lcv = 0; lcv < mineCheck.length; lcv++) {
            for (int i = 0; i < mineCheck[0].length; i++) {
                mineCheck[lcv][i] = 1;
            }
        }
        for (int lcv = 0; lcv < 10; lcv++) {
            int num = (int) Math.random()*64;

        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("nice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
