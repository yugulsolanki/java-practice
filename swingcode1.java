import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

class SwingCode1 extends JFrame implements MouseListener, MouseMotionListener{
	SwingCode1(){
		setSize(600,600);
		setVisible(true);
		setTitle("Mujhe kya pata");
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	static public void main(String arg[]){
		new SwingCode1();
	}
	public void mouseClicked(MouseEvent e){
		getContentPane().setBackground(Color.red);
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseDragged(MouseEvent e){}
	public void mouseMoved(MouseEvent e){
		getContentPane().setBackground(Color.black);
	}
}