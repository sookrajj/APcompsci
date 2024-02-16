package Q3.swing.First;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class first {
    private JPanel first; 
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel Hi;
    private JProgressBar buttonRadioButton;
    private JButton button5;
    private JButton button6;
    private JLabel mo;
    private JRadioButton radioButton1;
    private JLabel po;
    private static int cooks = 1;
    private static int cnt = 0;
    public static int check = 0;
    private static int timedcooks = 0;
    private static JPanel Next;

    public first() {
        ImageIcon img = new ImageIcon("cookie.jfif");
        mo.setText("Hi's per click " + 1);
        Hi.setText("hi's = " + cnt);
        po.setText("hi's per second = " + timedcooks);
        button1.setText("increse hi's count");
        button1.setIcon(img);
        button2.setText("hi's per click + 1 for 10 hi's");
        button3.setText("hi's per click + 10 for 100 hi's");
        button4.setText("hi's per second + 10 for 1000 hi's");
        button5.setText("hi's per click + 1000 for 10000 hi's");
        button6.setText("hi's per click + 10000 for 100000 hi's");
        radioButton1.setText("double clicks once ");
        Timer tr = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cnt += timedcooks;
                Hi.setText("hi's = " + cnt);
            }
        });
        tr.start();
        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Hi.setText("hi's = " + cnt);
                cnt += cooks;
                mo.setText("Hi's per click " + cooks);
                buttonRadioButton.setValue(cnt/100000);
                buttonRadioButton.getPercentComplete();
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (cnt > 10) {

                    cooks++;
                    cnt -= 10;
                    Hi.setText("hi's = " + cnt);
                    mo.setText("Hi's per click " + cooks);
                    buttonRadioButton.setValue(cnt/100000);
                    buttonRadioButton.getPercentComplete();
                }
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (cnt > 100) {
                    cooks += 10;
                    cnt -= 100;
                    Hi.setText("hi's = " + cnt);
                    mo.setText("Hi's per click " + cooks);
                    buttonRadioButton.setValue(cnt/100000);
                    buttonRadioButton.getPercentComplete();
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                if (cnt > 1000) {
                    timedcooks += 10;
                    cnt -= 1000;
                    Hi.setText("hi's = " + cnt);
                    po.setText("Hi's per second " + timedcooks);
                    buttonRadioButton.setValue(cnt/100000);
                    buttonRadioButton.getPercentComplete();
                }
            }
        });
        buttonRadioButton.setMaximum(100);
        button5.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                if (cnt > 10000) {
                    cooks += 1000;
                    cnt -= 10000;
                    Hi.setText("hi's = " + cnt);
                    mo.setText("Hi's per click " + cooks);
                }
            }
        });
        button6.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {

                if (cnt > 100000) {
                    cooks += 10000;
                    cnt -= 100000;
                    Hi.setText("hi's = " + cnt);
                    mo.setText("Hi's per click " + cooks);
                }
            }
        });
        radioButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (check == 0) {
                    cooks *= 2;
                    mo.setText("Hi's per click " + cooks);
                    check++;
                }

            }
        });

        if (buttonRadioButton.getPercentComplete() == 100) {
            Hi.setText("Yippie");

        }
    }




    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("nice");
        frame.setContentPane(new first().first);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
