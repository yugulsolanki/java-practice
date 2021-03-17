//package src;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.Color;


class SwingCode2 extends JFrame{
	{
		setSize(700,700);
		setVisible(true);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e){
				getContentPane().setBackground(Color.blue);
			}
		}
		);
		
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent e){
				getContentPane().setBackground(Color.yellow);
			}
		}
		);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
	}
	public static void main(String...arg){
		new SwingCode2();
	}
}