import javax.swing.*;
import java .awt.*;
public class Signup extends JFrame {
	
	
	Signup()
	{
		 setBounds(350,200,900,360);
		 getContentPane().setBackground(Color.white);
		 setLayout (null);
		 
		 
		 JPanel p1 = new JPanel();
		 p1.setBackground(new Color(184, 145, 182));
		 p1.setBounds(0,0,500,400);
		 p1.setLayout(null);
		 add(p1);
		 
		 
		 
		 
		 JLabel username = new JLabel ("Username");
		 username.setFont(new Font("SAN SERIF",Font.BOLD,14));
		 username.setBounds(50,20,125,25);
		 p1.add(username);
		 
		 
		 JTextField tusername = new JTextField();
		 tusername.setBounds(190,20,180,25);
		 tusername.setBorder(BorderFactory.createEmptyBorder());
		 p1.add(tusername);
		 
		 
		 JLabel name = new JLabel ("Name");
		 name.setFont(new Font("SAN SERIF",Font.BOLD,14));
		 name.setBounds(50,60,125,25);
		 p1.add(name);
		 
		 
		 JTextField tname = new JTextField();
		 tname.setBounds(190,60,180,25);
		 tname.setBorder(BorderFactory.createEmptyBorder());
		 p1.add(tname);
		 
		 JLabel password = new JLabel ("Password");
		 password.setFont(new Font("SAN SERIF",Font.BOLD,14));
		 password.setBounds(50,100,125,25);
		 p1.add(password);
		 
		 JTextField tpassword = new JTextField();
		 tpassword.setBounds(190,100,180,25);
		 tpassword.setBorder(BorderFactory.createEmptyBorder());
		 p1.add(tpassword);
		 
		 JLabel security = new JLabel ("Security Question");
		 security.setFont(new Font("SAN SERIF",Font.BOLD,14));
		 security.setBounds(50,140,125,25);
		 p1.add(security);
		 
		 Choice csecurity = new Choice();
		 csecurity.add("your first pet name");
		 csecurity.add("first teacher name");
		 csecurity.add("favorite color");
		 csecurity.setBounds(190,140,180,25);
		 p1.add(csecurity);
		 
		 JLabel answer = new JLabel ("Answer");
		 answer.setFont(new Font("SAN SERIF",Font.BOLD,14));
		 answer.setBounds(50,180,125,25);
		 p1.add(answer);
		 
		 JTextField tanswer = new JTextField();
		 tanswer.setBounds(190,180,180,25);
		 tanswer.setBorder(BorderFactory.createEmptyBorder());
		 p1.add(tanswer);
		 		
		 JButton create =new JButton("Create");
		 create.setForeground(new Color(184, 145, 182));
		 create.setBounds(80,250,100,30);
		 p1.add(create);
		 
		 
		 JButton back =new JButton("Back");
		 back.setForeground(new Color(184, 145, 182));
		 back.setBounds(250,250,100,30);
		 p1.add(back);
		 
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
		 Image i2= i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		 ImageIcon i3= new ImageIcon(i2);
		 JLabel image = new JLabel(i3);
		 image.setBounds(580,50,250,250);
		 add(image); 
		 
		 
		 setVisible(true);
		
	}
	public static void main(String[] args) {
		new Signup();
	}

}