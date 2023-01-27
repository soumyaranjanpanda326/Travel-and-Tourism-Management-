import javax.swing.*; 
                                                           // javax bcoz swing is in extended package
import java.awt.*;   // Image class
public  class Splash extends JFrame implements Runnable  {
	 Thread thread;
	 
	Splash(){
		
		
	    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
	    
	                                                         // imageIcon -- class which is used to load images within i1 object
	 		                                                // ClassLoader -- gives method  get system resource for accessing resources
	     
	    
	    Image i2= i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
	                                                         // image icon to image to set dimensions 
	     ImageIcon i3 = new ImageIcon(i2);
	                                                         // since Jlabel cannot handle image so image to image-icon
		
		
		JLabel image= new JLabel(i3);
		add(image);           
		                                                      // sets images in splash window
		      
				 
				 
	     setVisible(true );                                   // (makes hidden frame visible )
	    
	     
	     thread = new Thread(this);
	     thread.start();
	}
	
	public void run() {
		try { Thread.sleep(7000);
//		new Login();
		   }
			
		
	catch(Exception e) { }
	} 
	
	public static void main (String srgs[]) {
		 Splash  frame = new Splash();   
		 int x=1;
		 for(int i=1; i< 500;  x+=7, i+=6)
		 {
			 frame.setLocation(750-(x+i)/2 ,400-(i/2));
			 frame.setSize(x+i,i);
			 try {
				 Thread.sleep(10);
			 }
			 catch(Exception e) {}                                     // to set spalsh frame animated  not hardcode 
				 
			 
		 }
	 }
			 
			
	}

