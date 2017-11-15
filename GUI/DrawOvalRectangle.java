//Savannah Muniz

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DrawOvalRectangle extends JFrame{

	private final int WINDOW_HEIGHT = 240;
	private final int WINDOW_WIDTH = 600;
	JTextField xtext, ytext, wtext, htext;
	JButton drawOval, drawRectangle;
	JCheckBox filledBox;
	int xValue, yValue, wValue, hValue;
	
	public DrawOvalRectangle(){
		
		setTitle("Draw Rectangle or Oval");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(6,2));
		
		JLabel x = new JLabel("x");
		x.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel y = new JLabel("y");
		y.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel w = new JLabel("w");
		w.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel h = new JLabel("h");
		h.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel filled = new JLabel("Filled");
		filled.setHorizontalAlignment(SwingConstants.CENTER);
		
		xtext = new JTextField(4);
		ytext = new JTextField(4);
		wtext = new JTextField(4);
		htext = new JTextField(4);
		
		filledBox = new JCheckBox();
		filledBox.setHorizontalAlignment(SwingConstants.CENTER);
		
		drawOval = new JButton("Draw Oval");
		drawRectangle = new JButton("Draw Rectangle");
		
		panel1.add(x);
		panel1.add(xtext);
		panel1.add(y);
		panel1.add(ytext);
		panel1.add(w);
		panel1.add(wtext);
		panel1.add(h);
		panel1.add(htext);
		panel1.add(filled);
		panel1.add(filledBox);
		panel1.add(drawOval);
		panel1.add(drawRectangle);
		
		JPanel panel2 = new Panel2();
		
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}

	public class Panel2 extends JPanel{
		
		public Panel2(){
			setPreferredSize(new Dimension(300, 200));
			setBackground(Color.white);
			setBorder(BorderFactory.createLineBorder(Color.red, 2, false));
			drawOval.addActionListener(new OvalButtonListener());
			drawRectangle.addActionListener(new RectangleButtonListener());
		}
		
		public class RectangleButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				 Graphics g = getGraphics();
				 
				 xValue = Integer.parseInt(xtext.getText());
				 yValue = Integer.parseInt(ytext.getText());
				 wValue = Integer.parseInt(wtext.getText());
				 hValue = Integer.parseInt(htext.getText());
				 
				 if(filledBox.isSelected()){
					 g.fillRect(xValue, yValue, wValue, hValue);
				 }else{
					 g.drawRect(xValue, yValue, wValue, hValue);
				 }
				 
			}
		}
		
		public class OvalButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				Graphics g = getGraphics();
				 
				 xValue = Integer.parseInt(xtext.getText());
				 yValue = Integer.parseInt(ytext.getText());
				 wValue = Integer.parseInt(wtext.getText());
				 hValue = Integer.parseInt(htext.getText());
				 
				 if(filledBox.isSelected()){
					 g.fillOval(xValue, yValue, wValue, hValue);
				 }else{
					 g.drawOval(xValue, yValue, wValue, hValue);
				 }
				
			}
		}
	}
	
	
	public static void main(String[] args){
		new DrawOvalRectangle();
	}
}
