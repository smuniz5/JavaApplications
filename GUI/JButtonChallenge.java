//Savannah Muniz

import javax.swing.*;
import java.awt.*;

public class JButtonChallenge extends JFrame{

	private static int WINDOW_WIDTH = 205;
	private static int WINDOW_HEIGHT = 190;
	
	public JButtonChallenge(){
		setTitle("JButton Scoreboard");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		JLabel red = new JLabel("Red Team");
		red.setForeground(Color.red);
		red.setFont(new Font("Times", Font.BOLD, 15));
		red.setBounds(25, 20, 80, 40);
		add(red);
		
		JLabel blue = new JLabel("Blue Team");
		blue.setForeground(Color.blue);
		blue.setFont(new Font("Times", Font.BOLD, 15));
		blue.setBounds(115, 20, 80, 40);
		add(blue);
		
		JLabel score0 = new JLabel("0");
		score0.setBounds(50, 50, 60, 25);
		add(score0);
		
		JLabel score1 = new JLabel("0");
		score1.setBounds(145, 50, 60, 25);
		add(score1);
		
		JButton button0 = new JButton("Red Score!");
		button0.setBounds(5, 80, 100, 25);
		add(button0);
		
		JButton button1 = new JButton("Blue Score!");
		button1.setBounds(100, 80, 100, 25);
		add(button1);
		
		JButton button3 = new JButton("Reset Score");
		button3.setBounds(5, 120, 195, 25);
		add(button3);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new JButtonChallenge();
	}
}
