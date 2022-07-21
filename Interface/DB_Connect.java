package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.SwingConstants;

public class DB_Connect {

	   static final String DB_URL = "jdbc:mysql://localhost/database_1";
	   static final String USER = "root";
	   static final String PASS = "ranjit";

	public static void main(String [] ars) {
	JFrame j1 = new JFrame();
	Icon icon = new ImageIcon(("C:\\Users\\ranji\\OneDrive\\Pictures\\one.png"));
	JLabel l1 = new JLabel();
	l1.setText("TYPE YOUR NAME HERE :");
	l1.setBounds(35, 35, 210, 40);
	j1.add(l1);
	JButton b1 = new JButton(icon);
	b1.setBounds(60,150,155,60);
	//b1.setVerticalTextPosition(SwingConstants.BOTTOM);
	//b1.setHorizontalTextPosition(SwingConstants.CENTER);
	
	j1.add(b1);
	JTextField t1 = new JTextField();
	t1.setBounds(35, 70, 210, 40);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				){
			System.out.println("Inserting records into the table....");
			String string = t1.getText();
			//System.out.println(string);
			String sql = "INSERT INTO test(Name) VALUES('"+string+"')";			
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, string );
			System.out.println("Inserted ......");
			conn.close();
		}
			catch(Exception e1) {
				System.out.println("Error "+ e1);
			}
		//	 JOptionPane.showMessageDialog(t1, string);
			 
		}
	});
	j1.add(t1);
	j1.setLayout(null);
	j1.setSize(300,300);
	j1.setVisible(true);
	j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
}
