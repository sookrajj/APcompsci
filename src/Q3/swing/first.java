package Q3.swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class first {
    private JPanel first;
    private JButton button1;
    private JLabel Hi;

    public first() {

        button1.addMouseListener(new MouseAdapter() {
            int cnt = 0;
            @Override
            public void mouseClicked(MouseEvent e) {
                Hi.setText("HI World");
                cnt++;
                if (cnt > 10) Hi.setText("why?");
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
