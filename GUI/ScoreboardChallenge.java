//Savannah Muniz

import javax.swing.*;
import java.awt.*;

public class ScoreboardChallenge extends JFrame{

	private static int WINDOW_WIDTH = 205;
	private static int WINDOW_HEIGHT = 170;
	
	public ScoreboardChallenge(){
		
		setTitle("JButton Scoreboard");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 2));
		
		JLabel label1 = new JLabel("Red Team");
		label1.setForeground(Color.red);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(label1);
		
		JLabel label2 = new JLabel("Blue Team");
		label2.setForeground(Color.blue);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(label2);
		
		JLabel label3 = new JLabel("0");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(label3);
		
		JLabel label4 = new JLabel("0");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		panel1.add(label4);
		
		JButton button1 = new JButton("Red Score!");
		panel1.add(button1);
		
		JButton button2 = new JButton("Blue Score!");
		panel1.add(button2);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		JButton button3 = new JButton("Reset Score");
		button3.setPreferredSize(new Dimension(205, 25));
		panel2.add(button3);
		
		add(panel1);
		add(panel2);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ScoreboardChallenge();
	}
}
