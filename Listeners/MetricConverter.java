//Savannah Muniz

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MetricConverter extends JFrame {

	private JPanel panel, panel1;        
	private JLabel messageLabel; 
	private JTextField kiloTextField;  
	private JRadioButton milesButton;  
	private JRadioButton feetButton;   
	private JRadioButton inchesButton; 
	private ButtonGroup radioButtonGroup;  
	private final int WINDOW_WIDTH = 335; 
	private final int WINDOW_HEIGHT = 170; 
	private JLabel convertLabel;
	private JTextField conversion;
	
	public MetricConverter(){
		
		super("Metric Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		messageLabel = new JLabel("Enter a distance in kilometers:");
	    kiloTextField = new JTextField(10);
	    milesButton = new JRadioButton("Convert to miles");
	    feetButton = new JRadioButton("Convert to feet");
	    inchesButton = new JRadioButton("Convert to inches");

	    radioButtonGroup = new ButtonGroup();
	    radioButtonGroup.add(milesButton);
	    radioButtonGroup.add(feetButton);
	    radioButtonGroup.add(inchesButton);

	    milesButton.addActionListener(new RadioButtonListener());
	    feetButton.addActionListener(new RadioButtonListener());
	    inchesButton.addActionListener(new RadioButtonListener());
	    
	    convertLabel = new JLabel("Kilometers = ");
	    conversion = new JTextField(12);
	    conversion.setEditable(false);

	    panel = new JPanel();
	    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
	    panel.add(messageLabel);
	    panel.add(kiloTextField);
	    
	    panel1 = new JPanel();
	    panel1.setLayout(new GridLayout(2,2));
	    panel1.setPreferredSize(new Dimension(335,50));
	    panel1.setAlignmentX(CENTER_ALIGNMENT);
	    panel1.add(milesButton);
	    panel1.add(feetButton);
	    panel1.add(inchesButton);
	    
	    JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    panel2.add(convertLabel);
	    panel2.add(conversion);
	    
	    add(panel);
	    add(panel1);
	    add(panel2);
	    
		setVisible(true);
	}
	
	private class RadioButtonListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent e)
	      {
	         String input;          // To hold input
	         String convertTo = ""; // What we are converting to
	         double result = 0.0;   // To hold the conversion

	         input = kiloTextField.getText();
	        
	         if (e.getSource() == milesButton)
	         {
	            convertTo = " miles";
	            result = Double.parseDouble(input) * 0.6214;
	            conversion.setText(result + convertTo);
	            convertLabel.setText(kiloTextField.getText() + " kilometers = ");
	         }
	         else if (e.getSource() == feetButton)
	         {
	            convertTo = " feet";
	            result = Double.parseDouble(input) * 3281.0;
	            conversion.setText(result + convertTo);
	            convertLabel.setText(kiloTextField.getText() + " kilometers = ");
	         }
	         else if (e.getSource() == inchesButton)
	         {
	            convertTo = " inches";
	            result = Double.parseDouble(input) * 39370.0;
	            conversion.setText(result + convertTo);
	            convertLabel.setText(kiloTextField.getText() + " kilometers = ");
	         }

	         
	      }
	}
	
	public static void main(String[] args){
		
		new MetricConverter();
	}
	
}
