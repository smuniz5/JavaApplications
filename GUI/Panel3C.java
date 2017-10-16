//Savannah Muniz

import java.awt.*;
import javax.swing.*;

public class Panel3C extends JFrame{
	
	private static int WINDOW_WIDTH = 500;
	private static int WINDOW_HEIGHT = 200;
	
	public Panel3C(){
		
		setTitle("3 Colored Panels");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setLocation(50,50);
		panel1.setSize(100, 100);
		add(panel1);
		
		JLabel lightGray = new JLabel("Light Gray");
		lightGray.setFont(new Font("Times", Font.BOLD, 12));
		lightGray.setForeground(Color.LIGHT_GRAY);
		lightGray.setBounds(70, 25, 60, 25);
		add(lightGray);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.PINK);
		panel2.setLocation(200, 50);
		panel2.setSize(100, 100);
		add(panel2);
		
		JLabel pink = new JLabel("Pink");
		pink.setFont(new Font("Times", Font.BOLD, 12));
		pink.setForeground(Color.pink);
		pink.setBounds(240, 25, 60, 25);
		add(pink);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.red);
		panel3.setLocation(350, 50);
		panel3.setSize(100, 100);
		add(panel3);
		
		JLabel red = new JLabel("Red");
		red.setFont(new Font("Times", Font.BOLD, 12));
		red.setForeground(Color.red);
		red.setBounds(390, 25, 60, 25);
		add(red);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Panel3C();
	}
}
