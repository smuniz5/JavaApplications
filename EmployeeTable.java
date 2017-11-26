//Savannah Muniz

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.*;

public class EmployeeTable extends JFrame{
	
	private final int WINDOW_HEIGHT = 250;
	private final int WINDOW_WIDTH = 900;
	JPanel panel1, panel2;
	JButton add, update, remove;
	JTextField i, n, p, h;
	Connection conn;
	Statement stmt;
	ResultSet result;
	JScrollPane scroll;
	JTable employeeTable;
	String key, nam, pos, hp;
	DefaultTableModel model;
	
	public EmployeeTable(){
		
		setTitle("Employee Database");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		setLocationRelativeTo(null);
		
		try{
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
			stmt = conn.createStatement();
			String sqlStatement = "SELECT * FROM Employee";
			result = stmt.executeQuery(sqlStatement);
			ResultSetMetaData meta = result.getMetaData();
			
			model = new DefaultTableModel();
			employeeTable = new JTable(model);
			model.addColumn("Employee Id");
			model.addColumn("Name");
			model.addColumn("Position");
			model.addColumn("Hourly Pay");
			scroll = new JScrollPane(employeeTable);
			
			while(result.next()){
				 key = result.getString("EmployeeId");
				 nam = result.getString("Name");
				 pos = result.getString("Position");
				 hp = result.getString("HourlyPay");
				 model.addRow(new Object[]{key, nam, pos, hp});
			}
			
			conn.close();
		}catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
		
		add(scroll);
		panel2 = new UpdatePanel();
		add(panel2);
		setVisible(true);
	}
	public class UpdatePanel extends JPanel{
		
		JLabel id, name, position, hourlyPay;
		
		public UpdatePanel(){
			setLayout(new FlowLayout(FlowLayout.CENTER));
			i = new JTextField(5);
			n = new JTextField(5);
			p = new JTextField(5);
			h = new JTextField(5);
			
			id = new JLabel("Employee ID");
			name = new JLabel("Name");
			position = new JLabel("Position");
			hourlyPay = new JLabel("Hourly Pay");
	
			add = new JButton("Add Employee");
			update = new JButton("Update Employee");
			remove = new JButton("Remove Employee");
			
			JPanel panel3 = new JPanel();
			panel3.setLayout(new GridLayout(4, 2));
			panel3.setPreferredSize(new Dimension(400, 100));
			
			add(add);
			add.addActionListener(new ButtonListener());
			add(update);
			update.addActionListener(new ButtonListener());
			add(remove);
			remove.addActionListener(new ButtonListener());
			panel3.add(id);
			panel3.add(i);
			panel3.add(name);
			panel3.add(n);
			panel3.add(position);
			panel3.add(p);
			panel3.add(hourlyPay);
			panel3.add(h);
			add(panel3);
		}
	}
	
	public class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			try{
				conn = DriverManager.getConnection("jdbc:mariadb://localhost/personnel", "root", "");
				stmt = conn.createStatement();
				int k = Integer.parseInt(i.getText());
				String na = n.getText();
				String po = p.getText();
				double hour = Double.parseDouble(h.getText());
				int rowNo = 0;
				
				if(e.getSource() == add){
					result = stmt.executeQuery("INSERT INTO Employee VALUES("+k+",\""+na+"\",\""+po+"\","+hour+")");
					model.addRow(new Object[]{i.getText(), n.getText(), p.getText(), h.getText()});
				}
				else if(e.getSource() == update){
					for(int j = 0; j < model.getRowCount(); j++){
						if(model.getValueAt(j, 0).equals(i.getText())){
							rowNo = j;
							model.removeRow(rowNo);
						}
					}
					stmt.executeQuery("DELETE FROM Employee WHERE EmployeeId = "+Integer.parseInt(i.getText()));
					result = stmt.executeQuery("INSERT INTO Employee VALUES("+k+",\""+na+"\",\""+po+"\","+hour+")");
					model.addRow(new Object[]{i.getText(), n.getText(), p.getText(), h.getText()});
				}
				else if(e.getSource() == remove){
					result = stmt.executeQuery("DELETE FROM Employee WHERE EmployeeId = "+Integer.parseInt(i.getText()));
					for(int j = 0; j < model.getRowCount(); j++){
						if(model.getValueAt(j, 0).equals(i.getText())){
							rowNo = j;
							model.removeRow(rowNo);
						}
					}
				}
				conn.close();
			}catch(Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
				}
		}
	}

	public static void main(String[] args) throws Exception{
		
		new EmployeeTable();	
	}
}
