import java.awt.Frame;
import java.awt.Color;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
class FrmDemo extends Frame implements WindowListener{
	FrmDemo(){
		setBackground(Color.pink);
		setSize(600,600);
		setVisible(true);//sometimes the visibility if off, so we have to make visibility true
		setTitle("This is awt demo window");
		addWindowListener(this);//registry
		//this-event on current window
	}
	static public void main(String...arg){
		new FrmDemo();
	}
	
	//overriding all the methods of interface
	public void windowClosing(){
		dispose();
	}
	public void windowClosed(){}
	public void windowActivated(){}
	public void windowDeactivated(){}
	public void windowOpened(){}
	public void windowIconified(){}
	public void windowDeiconified(){}
}