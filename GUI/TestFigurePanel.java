//Savannah Muniz

import java.awt.*;
import javax.swing.*;

public class TestFigurePanel extends JFrame{
	
	private JPanel panel1, panel2, panel3 ,panel4, panel5, panel6;
	private final int WINDOW_WIDTH = 380;
	private final int WINDOW_HEIGHT = 220;

	public TestFigurePanel() {
		
		setTitle("Test Figure Panel");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,3));
		
		panel1 = new Panel1();
		panel2 = new Panel2();
		panel3 = new Panel3();
		panel4 = new Panel4();
		panel5 = new Panel5();
		panel6 = new Panel6();
		
		add(panel1);
		add(panel3);
		add(panel5);
		add(panel2);
		add(panel4);
		add(panel6);
		
		setVisible(true);
	}
	
	public class Panel1 extends JPanel{	
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawLine(10, 10, 100, 70);
			g.drawLine(10, 70, 100, 10);
		}
	}
	
	public class Panel2 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawOval(10, 10, 100, 70);
		}
	}
	
	public class Panel3 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 100, 70);
		}
	}
	
	public class Panel4 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.fillRect(10, 10, 100, 70);
		}
	}
	
	public class Panel5 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawRoundRect(10, 10, 100, 70, 25, 25);
		}
	}
	
	public class Panel6 extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRoundRect(10, 10, 100, 70, 25, 25);
		}
	}
	
	public static void main(String[] args){
		
		new TestFigurePanel();
	}
	
}
