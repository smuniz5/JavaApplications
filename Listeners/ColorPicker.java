//Savannah Muniz

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPicker extends JFrame{

	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	private JPanel panel;
	private int x,y;
	
	public ColorPicker(){
		
		setTitle("Color Picker");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panel = new JPanel();
		panel.addMouseMotionListener(new Listener());
		panel.addMouseListener(new Listener());
		
		add(panel);
		setVisible(true);
	}
	
	public class Listener extends MouseAdapter{
			
		public void mouseMoved(MouseEvent e){
			x = e.getX();
			y = e.getY();
			if(x < 100){
				if(y < 100)
					panel.setBackground(new Color(100, 50, 78));
				if(y > 100 && y < 200)
					panel.setBackground(new Color(31, 78, 92));
				if(y > 200 && y < 300)
					panel.setBackground(new Color(50, 100, 255));
				if(y > 300)
					panel.setBackground(new Color (10, 90, 45));
			}
			if(x > 100 && x < 200){
				if(y < 100)
					panel.setBackground(new Color(200, 40, 60));
				if(y > 100 && y < 200)
					panel.setBackground(new Color(37, 89, 7));
				if(y > 200 && y < 300)
					panel.setBackground(new Color(56, 34, 90));
				if(y > 300)
					panel.setBackground(new Color (12, 90, 56));
			}
			if(x > 200 && x < 300){
				if(y < 100)
					panel.setBackground(new Color(100, 0, 3));
				if(y > 100 && y < 200)
					panel.setBackground(new Color(31, 5, 97));
				if(y > 200 && y < 300)
					panel.setBackground(new Color(45, 100, 1));
				if(y > 300)
					panel.setBackground(new Color (0, 90, 5));
		    }
			if(x > 300){
				if(y < 100)
					panel.setBackground(new Color(0, 50, 78));
				if(y > 100 && y < 200)
					panel.setBackground(new Color(30, 8, 2));
				if(y > 200 && y < 300)
					panel.setBackground(new Color(50, 1, 230));
				if(y > 300)
					panel.setBackground(new Color (5, 90, 45));
			}
				
		}
		public void mouseExited(MouseEvent e){
			panel.setBackground(Color.white);
		}
}
	
	public static void main(String[] args){
		new ColorPicker();
	}
}
