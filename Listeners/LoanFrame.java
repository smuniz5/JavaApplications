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
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 240;
	
	public LoanFrame(){
		
		setTitle("Loan Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5,2));
		panel1.setPreferredSize(new Dimension(WINDOW_WIDTH,150));
		
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
		
		panel1.add(annual);
		panel1.add(a);
		panel1.add(years);
		panel1.add(y);
		panel1.add(loan);
		panel1.add(l);
		panel1.add(monthly);
		panel1.add(m);
		panel1.add(total);
		panel1.add(t);
		
		
		panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Enter loan amount, interest rate, and years"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel2.setPreferredSize(new Dimension(350,100));
		
		panel2.add(compute);
		
		add(panel1);
		add(panel2);
		
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
