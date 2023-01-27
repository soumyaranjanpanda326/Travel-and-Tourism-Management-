
import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
	
public class Login  extends JFrame {
	 Login(){
			 setSize(900,400);
			 setLocation(350,200);
			 setLayout(null);               // to customise layout 
			 
			 
			 JPanel p1= new JPanel();
			 p1.setBackground( new Color(184, 145, 182));
			 p1.setBounds(0,0, 400,400);                           // (location  , length ,width )
			 add(p1);
			 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
			 Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
			 ImageIcon i3= new ImageIcon(i2);
			 JLabel image = new JLabel(i3);
			 image.setBounds(90,65,200,200);
			 p1.setLayout(null);
			 p1.add(image);                                               // pasted image above pannel 
			 
			       // GUI for pannel 2
			 
			 JPanel p2= new JPanel();
			 p2.setBounds(400,20,450,300);
			 add(p2);
			 p2.setLayout(null);
			 JLabel username = new JLabel("Username");
			 username.setBounds(60,30,100,25);
			 username.setFont(new Font("SAN SERIF",Font.PLAIN,20));
			 p2.add(username);
			 JTextField tusername = new JTextField();
			 tusername.setBounds(60,60,300,35);
			 tusername.setBorder(BorderFactory.createEmptyBorder());
			 p2.add(tusername);
			 
			 JLabel password = new JLabel("Password");
			 password.setBounds(60,105,100,25);
			 password.setFont(new Font("SAN SERIF",Font.PLAIN,20));
			 p2.add(password);
			 JTextField tpassword = new JTextField();
			 tpassword.setBounds(60,140,300,35);
			 tpassword.setBorder(BorderFactory.createEmptyBorder());
			 p2.add(tpassword);
			 JButton login = new JButton("Login");
			 login.setBounds(60,200,130,30);
			 login.setBackground(new Color(184, 145, 182));
			 login.setBorder(new LineBorder(new Color(184, 145, 182)));
			 p2.add(login);
			 
			 JButton signup = new JButton("Signup");
			 signup.setBounds(200,200,130,30);
			 signup.setBackground(new Color(184, 145, 182));
			 signup.setBorder(new LineBorder(new Color(184, 145, 182)));
			 p2.add(signup);
			 
			 
			 JButton forgotpassword = new JButton("Forgotpassword");
			 forgotpassword.setBounds(130,250,150,30);
			 forgotpassword.setBackground(new Color(184, 145, 182));
			 forgotpassword.setBorder(new LineBorder(new Color(184, 145, 182)));
			 p2.add(forgotpassword);
			 JLabel text= new JLabel("Trouble in Login..");
			 text.setBounds(300,250,150,20);
			 text.setForeground(Color.RED);
			 p2.add(text);
			 
			 setVisible(true); 
			 
	 }
	public static void main(String[] args) {
		new Login();

	}

}
