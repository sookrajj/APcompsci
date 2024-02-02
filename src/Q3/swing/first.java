package Q3.swing;

import javax.swing.*;
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

    public first() {

        button1.addMouseListener(new MouseAdapter() {
            int cnt = 0;
            int cooks = 1;
            @Override
            public void mouseClicked(MouseEvent e) {
                Hi.setText(cnt);
                cnt += cooks;
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (cnt > 10) {
                    cooks++;
                    cnt -= 10;
                }
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (cnt > 100) {
                    cooks += 10;
                    cnt -= 100;
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
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
        button2 b2 = new button2("Count +1");
        b2.setBounds(100, 100, 100, 50);
        frame.add(b2);
        button3 b3 = new button3("Count +10");
        b3.setBounds(100, 50, 100, 50);
        frame.add(b3);
        button4 b4 = new button4("Count +1000");
        b4.setBounds(100, 0, 100, 50);
        frame.add(b4);
    }
}
