
import java.awt.*;
import java.awt.event.*;


public class MouseTracker extends Frame implements MouseMotionListener,MouseListener {
    TextField textField;

    public MouseTracker(){
        setLayout(new FlowLayout());

        textField = new TextField(30);
        add(textField);

        addMouseMotionListener(this);
        addMouseListener(this);

        setSize(400,300);
        setVisible(true);
    }
    
    public void mouseMoved(MouseEvent e){
        textField.setText("Mouse Moved("+e.getX()+", "+e.getY()+")");
    }

    public void mouseClicked(MouseEvent e){
        textField.setText("Mouse clicked("+e.getX()+", "+e.getY()+")");
    }
    
    public void mouseEntered(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
    public void windowClose(WindowEvent e){
        dispose();
    }

    public void windowClosed(WindowEvent e){}
    public void windowOpened(WindowEvent e){}


    public static void main(String[] args) {
        new MouseTracker();
    }
}
