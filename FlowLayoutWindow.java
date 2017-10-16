//Savannah Muniz

import java.awt.FlowLayout;
import javax.swing.*;


public class FlowLayoutWindow extends JFrame{
	
	private final int WINDOW_HEIGHT = 220;
	private final int WINDOW_LENGTH = 150;
	
	public FlowLayoutWindow(){
		
		setTitle("FlowLayout");
		setSize(WINDOW_HEIGHT, WINDOW_LENGTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		JLabel first = new JLabel("First Name");
		JTextField fField = new JTextField(4);
		JLabel last = new JLabel("Last Name");
		JTextField lField = new JTextField(4);
		JLabel middle = new JLabel("MI");
		JTextField mText = new JTextField(1);
		
		add(first);
		add(fField);
		add(middle);
		add(mText);
		add(last);
		add(lField);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new FlowLayoutWindow();
	}
}
