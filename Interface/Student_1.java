package Interface;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Student_1  {
	public Student_1() {
		JFrame f1 = new JFrame();
		 f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 f1.setTitle("STUDENT DATABASE");
		 Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ranji\\eclipse-workspace\\Programs\\src\\Interface\\603156.png");
		 f1.setIconImage(icon);
		 Icon icon1 = new ImageIcon(("C:\\Users\\ranji\\eclipse-workspace\\Programs\\src\\Interface\\add.jpg"));
		 JButton b1 = new JButton(icon1);
		 JButton b2 = new JButton();
		 JButton b3 = new JButton();
		 b1.setBounds(30, 30, 150, 60);
		 b2.setBounds(210, 30, 150, 60);
		 b3.setBounds(395, 30, 150, 60);
		 f1.add(b1);
		 f1.add(b2);
		 f1.add(b3);
		 f1.setLayout(null);
		 f1.setSize(800, 500);
		 f1.setLocation(800, 200);
		 f1.setVisible(true);
	}
	
	
	

}
