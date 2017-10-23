//Savannah Muniz

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame{
	
	JButton b;
	JTextField cfield;
	JTextField ffield;
	double celsius = 0;
	double fahrenheit = 0;
	private final int WINDOW_WIDTH = 360;
	private final int WINDOW_HEIGHT = 75;

	public TempConverter(){
		
		setTitle("Temperature Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel c = new JLabel("Celsius:");
		cfield = new JTextField(4);
		
		JLabel f = new JLabel("Fahrenheit:");
		ffield = new JTextField(4);
		
		b = new JButton("Convert");
		
		add(c);
		add(cfield);
		add(f);
		ffield.setEditable(false);
		add(ffield);
		add(b);
		
		b.addActionListener(new Listener());
		setVisible(true);
	}
	
	public class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			celsius = Double.parseDouble(cfield.getText());
			fahrenheit = (9.0/5.0)*celsius + 32.0;
			ffield.setText(fahrenheit + "");
		}
	}
	
	public static void main(String[] args){
		
		new TempConverter();
		
	}
}
