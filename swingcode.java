import javax.swing.JFrame;
import java.awt.Color;

class SwingCode extends JFrame{
	SwingCode(){
		setSize(600,600);
		setVisible(true);
		setTitle("MY new window");
		getContentPane().setBackground(Color.red);
		//OR
		//Container ref = getContentPane();
		//ref.setBackground(Color.yellow);
		
		//to close the window
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	static public void main(String...arg){
		new SwingCode();
	}
}