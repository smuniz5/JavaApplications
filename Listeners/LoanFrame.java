//Savannah Muniz

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

@SuppressWarnings("serial")
public class LoanFrame extends JFrame{

	private JButton compute;
	private JLabel prompt;
	private JLabel annual, years, loan, monthly, total;
	private JTextField a, y, l, m, t;
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 250;
	
	public LoanFrame(){
		
		setTitle("Loan Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		prompt = new JLabel("Enter loan amount, interest rate, and years");
		panel1.add(prompt);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5,2));
		
		compute = new JButton("Compute Payment");
		compute.addActionListener(new ButtonListener());
		
		annual = new JLabel("Annual Interest Rate");
		years = new JLabel("Number of years");
		loan = new JLabel("Loan Amount");
		monthly = new JLabel("Montly Payment");
		total = new JLabel("Total Payment");
		
		a = new JTextField(10);
		y = new JTextField(10);
		l = new JTextField(10);
		m = new JTextField(10);
		m.setEditable(false);
		t = new JTextField(10);
		t.setEditable(false);
		
		panel2.add(annual);
		panel2.add(a);
		panel2.add(years);
		panel2.add(y);
		panel2.add(loan);
		panel2.add(l);
		panel2.add(monthly);
		panel2.add(m);
		panel2.add(total);
		panel2.add(t);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel3.setPreferredSize(new Dimension(300,100));
		
		panel3.add(compute);
		
		add(panel1);
		add(panel2);
		add(panel3);
		
		setVisible(true);
		
		}
	
	public class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			DecimalFormat money = new DecimalFormat("0.00");
			Loan loan = new Loan(Double.parseDouble(a.getText()), Integer.parseInt(y.getText()), Double.parseDouble(l.getText()));
			m.setText(money.format(loan.getMonthlyPayment()));
			t.setText(money.format(loan.getTotalPayment()));
			System.out.println(e.paramString());
		}
	}
	
	public static void main(String[] args){
		
		new LoanFrame();
		
	}
}
