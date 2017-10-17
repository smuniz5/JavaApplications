//Savannah Muniz

import java.awt.*;
import javax.swing.*;

public class GridLayoutChallenge extends JFrame{

	private static int WINDOW_WIDTH = 400;
	private static int WINDOW_HEIGHT = 200;
	
	public GridLayoutChallenge(){
		
		setTitle("Grid Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 3));
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("This is cell 1.");
		panel1.add(label1);
		JButton button1 = new JButton("Button 1");
		panel1.add(button1);
		add(panel1);
		
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("This is cell 2.");
		panel2.add(label2);
		JButton button2 = new JButton("Button 2");
		panel2.add(button2);
		add(panel2);
		
		JPanel panel3 = new JPanel();
		JLabel label3 = new JLabel("This is cell 3.");
		panel3.add(label3);
		JButton button3 = new JButton("Button 3");
		panel3.add(button3);
		add(panel3);
		
		JPanel panel4 = new JPanel();
		JLabel label4 = new JLabel("This is cell 4.");
		panel4.add(label4);
		JButton button4 = new JButton("Button 4");
		panel4.add(button4);
		add(panel4);
		
		JPanel panel5 = new JPanel();
		JLabel label5 = new JLabel("This is cell 5.");
		panel5.add(label5);
		JButton button5 = new JButton("Button 5");
		panel5.add(button5);
		add(panel5);
		
		JPanel panel6 = new JPanel();
		JLabel label6 = new JLabel("This is cell 6.");
		panel6.add(label6);
		JButton button6 = new JButton("Button 6");
		panel6.add(button6);
		add(panel6);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new GridLayoutChallenge();
	}
}
