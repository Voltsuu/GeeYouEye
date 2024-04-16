import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel label1;
    private JLabel label2;
    private int val = 0;
    private int changes = 0;

    public GUI(){
        JFrame frame = new JFrame("Simple GOOEY");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        frame.add(panel);

        label1 = new JLabel("Value: " + val);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);

        label2 = new JLabel("Total changes: " + changes);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);

        JButton b1 = new JButton("+1");
        JButton b2 = new JButton("-1");
        panel.add(b1);
        panel.add(b2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1Press();
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2Press();
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
    public void b1Press() {
        val++;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Total changes: " + changes);
    }
    public void b2Press() {
        val--;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Total changes: " + changes);
    }
}