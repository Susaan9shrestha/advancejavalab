package mouseevent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample extends JFrame implements MouseListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;

    public MouseEventExample() {
      
        setTitle("Java MouseEvent Examples");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

     
        label = new JLabel("", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

     
        addMouseListener(this);

      
        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    public static void main(String[] args) {
       
        new MouseEventExample();
    }
}
