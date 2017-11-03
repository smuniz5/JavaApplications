//Savannah Muniz

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FontCustomizer extends JFrame {
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 150;
	private JTextField text;
	private JPanel panel1, panel2;
	private JRadioButton arial, times, verdana;
	private JCheckBox bold, red;
	private Font font1;
	
	public FontCustomizer(){
		
		setTitle("Font Customizer");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		text = new JTextField(12);
		text.setPreferredSize(new Dimension(100,50));
		
		font1 = new Font("Arial", Font.PLAIN, 30);
		text.setFont(font1);
		
		panel1.add(text);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,3));
		
		arial = new JRadioButton("Arial", true);
		arial.addItemListener(new Listener());
		times = new JRadioButton("Times");
		times.addItemListener(new Listener());
		verdana = new JRadioButton("Verdana");
		verdana.addItemListener(new Listener());
		ButtonGroup group = new ButtonGroup();
		group.add(arial);
		group.add(times);
		group.add(verdana);
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new Listener());
		red = new JCheckBox("Red");
		red.addItemListener(new Listener());
		
		panel2.add(arial);
		panel2.add(times);
		panel2.add(verdana);
		panel2.add(bold);
		panel2.add(red);
		
		add(panel1);
		add(panel2);
		
		setVisible(true);
		
	}
	
	private class Listener implements ItemListener{
		
		public void itemStateChanged(ItemEvent e){
			
			if(e.getSource() == arial){
				if(bold.isSelected()){
					text.setFont(new Font("Arial", Font.BOLD, 30));
				}else{
					text.setFont(font1);
				}
			}
			
			if(e.getSource() == times){  
				if(bold.isSelected()){
					text.setFont(new Font("Times", Font.BOLD, 30));
				}else{
					text.setFont(new Font("Times", Font.PLAIN,30));
				}
			}
			
			if(e.getSource() == verdana){  
				if(bold.isSelected()){
					text.setFont(new Font("Verdana", Font.BOLD,30));
				}else{
					text.setFont(new Font("Verdana", Font.PLAIN,30));
				}
			}
			
			if(e.getSource() == bold){
				if(bold.isSelected()){
					text.setFont(text.getFont().deriveFont(Font.BOLD));
				}else{
					text.setFont(text.getFont().deriveFont(Font.PLAIN));
				}
			}
			
			if(e.getSource() == red){
				if(red.isSelected()){
					text.setForeground(Color.red);
				}else{
					text.setForeground(Color.black);
				}
			}
		}
	}

	public static void main(String[] args){
		
		new FontCustomizer();
	}
}
