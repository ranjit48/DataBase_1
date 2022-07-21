package Interface;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	public static void main(String [] args) throws IOException {
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 final String DB_URL = "jdbc:mysql://localhost/database_1";
	 JFrame j1 = new JFrame();
	 Image icon1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ranji\\eclipse-workspace\\Programs\\src\\Interface\\login.png");
	 j1.setIconImage(icon1);
	 j1.setSize(220, 200);
	 j1.setLocation(800, 400);
	 JButton b1 = new JButton();
	 JButton b2 = new JButton();
	 b1.setText("CANCEL");
	 b2.setText("CONNECT");
	 b1.setBounds(10,115,80,30);
	 b2.setBounds(100,115,90,30);
	 JLabel l1 = new JLabel();
	 l1.setBounds(10, 10, 90, 10);
	 l1.setText("Enter USER ID");
	 JTextField v1 = new JTextField();
	 v1.setBounds(10,25,150,30);
	 JLabel l2 = new JLabel();
	 l2.setText("Enter DATABASE PASSWORD");
	 l2.setBounds(10, 65, 200, 10);
	 JPasswordField v2 = new JPasswordField();
	 v2.setBounds(10,80,150,30);
	 b1.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 v1.setText("");
			 v2.setText("");
			  
		 }
	 });
	 
	 b2.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 String ID = v1.getText();
			 @SuppressWarnings("deprecation")
			String PASSWORD = v2.getText();
		//	 System.out.println(ID + " " + PASSWORD);
			 
			 try(Connection con = DriverManager.getConnection(DB_URL,ID,PASSWORD);
					 Statement st = con.createStatement();){
				 boolean Test = true;
			//	 System.out.println("Connected");
				 if(Test == true) {
					  JOptionPane.showMessageDialog(null, "connected..");
					  j1.setVisible(false);
					   new Student_1();
				 }
			 }catch(Exception ex){
				  JOptionPane.showMessageDialog(null,"Wrong Info ...");
			 }
			 
			  
		 }
	 });
	 j1.add(l2);
	 j1.add(v2);
	 j1.add(v1); 
	 j1.add(l1);
	 j1.add(b1);
	 j1.add(b2);
	 j1.setLayout(null);
	 j1.setVisible(true);
	
	 
	 
	 
	}
}
