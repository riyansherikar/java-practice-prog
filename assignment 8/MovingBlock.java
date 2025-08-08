import java.awt.*;
import java.awt.event.*;

public class MovingBlock extends Frame implements ActionListener{

    int x = 100 ,y= 100;
    Button up,down,left,right;

    public MovingBlock(){
        setLayout(new FlowLayout());

        left = new Button("Left");
        right = new Button("right");
        up = new Button("up");
        down = new Button("down");

        add(up);
        add(down);
        add(left);
        add(right);

        left.addActionListener(this);
        right.addActionListener(this);
        up.addActionListener(this);
        down.addActionListener(this);

        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == left && x>20) x-= 10;
        if(e.getSource() == right && x<350) x+= 10;
        if(e.getSource() == up && y>50) y-= 10;
        if(e.getSource() == down && y<350) y+= 10;
        repaint();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        new MovingBlock();
    }
    
}
