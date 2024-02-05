package Q3.swing;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class first {
    private JPanel first;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel Hi;
    private static int cooks = 1;
    private static int cnt = 0;
    private static Timer time;
    private static int add = 0;


    public first() {


        time.schedule(new TimerTask() {
            public int add(int add) {
                cnt += add;
                return cnt;
            }
        }, 0, 1000);
        button1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Hi.setText("hi's = " + cnt);
                cnt += cooks;
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (cnt > 10) {
                    button2.setText("hi's per click + 1");
                    cooks++;
                    cnt -= 10;
                }
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                button3.setText("hi's per click + 10");
                if (cnt > 100) {
                    cooks += 10;
                    cnt -= 100;
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                button4.setText("hi's per click + 1000");
                if (cnt > 1000) {
                    cooks += 1000;
                    cnt -= 1000;
                }
            }
        });
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
