
import java.awt.*;
import java.awt.event.*;


public class Hellocolor extends Frame implements ActionListener{
    Label label;
    Button changeColor;

    public Hellocolor(){
        setLayout(new FlowLayout());

        label = new Label("hello");

        label.setBackground(Color.RED);
        label.setFont(new Font("Georgia",Font.BOLD,20));
        add(label);

        changeColor = new Button("Change to Blue");
        changeColor.addActionListener(this);
        add(changeColor);
        setSize(300,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        label.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        new Hellocolor();
    }
}
