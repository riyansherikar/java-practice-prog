import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class PreventCloseFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prevent close example");
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Try to close the window");
        label.setFont(new Font("Arial",Font.BOLD,16));
        frame.add(label);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.getContentPane().setBackground(Color.RED);
                JOptionPane.showMessageDialog(frame, "You cannot close this window");
            }
        });

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
