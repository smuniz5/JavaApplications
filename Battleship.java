//Savannah Muniz

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Battleship extends JFrame{

	private final int WINDOW_WIDTH = 700;
	private final int WINDOW_HEIGHT = 780;
	JPanel panel1, panel2, panel3, panel4, panel5;
	JLabel attempts;
	JTextField noOfAttempts;
	JLabel hit, miss, kill, winner;
	JTextField y, g, b;
	int userTries = 0;
	int ship2Count = 0, ship3Count = 0, winCount = 0;
	JPanel panelB[][] = new JPanel[7][7];
	int row1, column1;
	int row2, column2, column2_2;
	int row3, column3, row3_2, row3_3;
	int ships[][];
	
	public Battleship(){
		
		setTitle("Battleship");	//set window's properties	
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel1 = new JPanel(); //create panel to hold 7x7 board
		panel1.setLayout(new GridLayout(7,7));
		
		//ship that takes up 3 spaces is placed vertically by default
		row3 = (int)(Math.random() * 4); //row for 3x1 ship
		column3 = (int)(Math.random() * 4);	//column for 3x1 ship
		
		row3_2 = row3 + 1;
		row3_3 = row3_2 + 1;
		
		//ship that takes up 2 spaces is placed horizontally by default
		do{
			row2 = (int)(Math.random() * 5); //row for 1x2 ship
			column2 = (int)(Math.random() * 5);	//column for 1x2 ship
			column2_2 = column2 + 1;
		}while(((column2 == column3) && ((row2 == row3) || (row2 == row3_2) || (row2 == row3_3))) || ((column2_2 == column3) && ((row2 == row3) || (row2 == row3_2) || (row2 == row3_3))));
		
		do{
			row1 = (int)(Math.random() * 7); //row for 1x1 ship
			column1 = (int) (Math.random() * 7); //column for 1x1 ship
		}while(((row1 == row2) && ((column1 == column2) || (column1 == column2_2))) || ((column1 == column3) && ((row1 == row3) || (row1 == row3_2) || (row1 == row3_3))));
		
		
		System.out.println(row1 + " " +column1);
		System.out.println(row2 + " " +column2);
		System.out.println(row3 + " " +column3);
		
		//creates board panels and adds MouseListener for each 
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				panelB[i][j] = new BoardPanels();
				panelB[i][j].addMouseListener(new PanelListener());
				panel1.add(panelB[i][j]);
			}	
		}
		
		//creates panel2 to hold legend for colors 
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		attempts = new JLabel("Number of User Attempts: ");
		noOfAttempts = new JTextField(2);
		noOfAttempts.setEditable(false);
		
		hit = new JLabel("Hit!");
		miss = new JLabel("Miss!");
		kill = new JLabel("Kill!");
		y = new JTextField(1);
		y.setEditable(false);
		y.setBackground(Color.yellow);
		g = new JTextField(1);
		g.setEditable(false);
		g.setBackground(Color.lightGray);
		b = new JTextField(1);
		b.setEditable(false);
		b.setBackground(Color.black);
		panel2.add(hit);
		panel2.add(y);
		panel2.add(miss);
		panel2.add(g);
		panel2.add(kill);
		panel2.add(b);
		
		add(panel1);
		add(panel2);
		
		
		setVisible(true);
	}
	
	public class BoardPanels extends JPanel{
		
		public BoardPanels(){
			setPreferredSize(new Dimension(100, 100));
			setBackground(Color.pink);
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		}
	}
	
	public class PanelListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e){
			JPanel clicked = new JPanel(); //clicked is the panel that the user selected
			clicked = (JPanel) e.getSource();
			
			//if user has selected a new panel, increment the userTries count
			if(clicked.getBackground() == Color.pink){
				userTries++;
			}
			
			//if user selected 1x1 ship, ship has been automatically killed
			if(clicked == panelB[row1][column1]){
				clicked.setBackground(Color.black);
				winCount++;
			}else if((clicked == panelB[row2][column2]) || (clicked == panelB[row2][column2_2])){
				ship2Count++; //if user selected 1x2 ship, increment ship2Count
				if(ship2Count == 2){ //if both of the panels that make up the 1x2 ship have been selected, kill the ship
					clicked = panelB[row2][column2];
					clicked.setBackground(Color.black);
					clicked = panelB[row2][column2_2];
					clicked.setBackground(Color.black);
					winCount++; 
				}else{ //ship has only suffered a hit
					clicked.setBackground(Color.yellow); 
				}
			}else if((clicked == panelB[row3][column3]) || (clicked == panelB[row3_2][column3]) || (clicked == panelB[row3_3][column3])){
				ship3Count++; //if user selected 3x1 ship, increment ship3Count
				if(ship3Count == 3){ //kill the ship if ship3Count = 3
					clicked = panelB[row3][column3];
					clicked.setBackground(Color.black);
					clicked = panelB[row3_2][column3];
					clicked.setBackground(Color.black);
					clicked = panelB[row3_3][column3];
					clicked.setBackground(Color.black);
					winCount++;
				}else{ //ship has only suffered a hit
					clicked.setBackground(Color.yellow);
				}
			}else{ //user has missed 
				clicked.setBackground(Color.lightGray);
			}
					
			noOfAttempts.setText(userTries + "");
			
			if(winCount == 3){ //if all three ships have been killed, go to winner screen
				panel1.setVisible(false); //remove visibility of game board
				panel2.setVisible(false); //remove visibility of board legend
					
				panel3 = new JPanel(); //instantiate winner screen panel
				panel3.setPreferredSize(new Dimension(600,600));
				panel3.setLayout(new BorderLayout());
				winner = new JLabel("WINNER!");
				winner.setHorizontalAlignment(SwingConstants.CENTER);
				winner.setFont(new Font("Impact", Font.BOLD, 150));
				panel4 = new JPanel();
				panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
				attempts.setFont(new Font("Impact", Font.PLAIN, 30));
				noOfAttempts.setFont(new Font("Impact", Font.PLAIN, 30));
				panel4.add(attempts);
				panel4.add(noOfAttempts);
				noOfAttempts.setBackground(null); 
				noOfAttempts.setBorder(null);
				panel3.add(winner, BorderLayout.CENTER);
				panel3.add(panel4, BorderLayout.SOUTH);
					
				add(panel3); //add panel3 to frame
				
			}	
		}
	}
	
	public static void main(String[] args){
		
		new Battleship();
	}
}
