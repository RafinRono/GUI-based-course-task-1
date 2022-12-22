//Section: E ID: 22-47226-1

import javax.swing.*;                       //for JFrame, JLabel etc
import java.awt.event.*;                    //needed for actionListener
import java.awt.*;                          //needed for adding Color, fonts

class UserLogin implements ActionListener   //using the actionListener interface
{  
	JFrame f;                               //making a frame
	 
	ImageIcon i1;                           //needed for using images
	ImageIcon i2;

    JLabel l1;                              //making labels for texts or images
	JLabel l2;	
	JLabel l3;
	JLabel l4;
	
	JTextField tf;                          //for inputting texts
	 
    JPasswordField pf;                      //for censored text input
	
    JButton b1;                             //for making interactable buttons 
    JButton b2;
	
    UserLogin()
    {  
        f= new JFrame(); 
        
        i1 = new ImageIcon("Sources/pic.png");               //passing the image location as argument
        i2 = new ImageIcon("Sources/pic1.png");
        
		l1 = new JLabel("Username:");                        //passing the label text as argument 
		l1.setFont(new Font("Comic Sans MS",Font.BOLD, 15)); //creating a new Font object, passing font face, style and font size as arguments
		l1.setForeground( new Color (16, 235, 38) );         //changing the text color
		l1.setBounds(215,420,100,30);                        //setting the label position within the frame

		l2 = new JLabel("Password:");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD, 15));
		l2.setForeground( new Color (16, 235, 38) );
		l2.setBounds(217,446,100,30); 		
		
		l3 = new JLabel();
		l3.setIcon(i2);                                      //inserting image inside a label
		l3.setBounds(130,20,400,400);
		
		l4 = new JLabel("Made by: Rafin Abrar Rono");
		l4.setFont(new Font("Times New Roman",Font.BOLD, 15));
		l4.setForeground( new Color (16, 235, 38) );
		l4.setBounds(500,639,190,30); 	
		
        tf = new JTextField();                  
        tf.setBounds(296,426,160,23);  
		
		pf = new JPasswordField();  
        pf.setBounds(296,452,160,23); 
          
        b1=new JButton("Login");                             //passing button name as parameter
        b1.setBounds(270,490,70,20);  
        b1.addActionListener(this);							 //adding an action event listener to this button
        
        b2=new JButton("Exit");  
        b2.setBounds(350,490,70,20);  
        b2.addActionListener(this);
		
		f.add(l1);                                            //adding various components to the frame
		f.add(l2);
		f.add(l3);
		//f.add(l4);
        f.add(tf);
        f.add(pf);
		f.add(b1); 
		f.add(b2);
		
        f.setSize(700,700);                                   //setting size of the frame        
        f.setLayout(null);  
        f.setTitle("________________________________________________User Login_______________________________________________");  //setting the title of the frame
        f.setResizable(false);                                     //forbids resizing through dragging the border
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          //closes the frame and forbids it from running in the background
        f.setIconImage( i1.getImage() );                           //returning an image and passing it as argument to set as Icon image
        f.setLocationRelativeTo(null);                             //makes the new frame open in the middle of the screen
        f.getContentPane().setBackground(new Color(43, 44, 48));   //setting the bg color for a frame other rgb codes 64, 90, 227 ; 255,137,0
        f.setVisible(true);                          
    }         
    public void actionPerformed(ActionEvent e)                    //overriding the abstract method of ActionListener interface
    {          
        if(e.getSource()==b1)                                     //checking if the source is from a particular button
		{  
			String user = tf.getText();                           //storing the string inputted inside text field as a string literal
			String pass = String.valueOf(pf.getPassword());

            if(user.equals("Rono") && pass.equals("1216"))        //matching username and password 
			{
				f.dispose();                                      //terminates the frame
				new Welcome(36, 34, 34);                          //creating another frame while passing rgb values for frame bg color
			}

			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Username and password! Check again");  //pop-up when user and pass do not match
			}
        }
        
        if(e.getSource()==b2)   //for exiting the entire frame when clicking "Exit"
        {
        	System.exit(0);
        }
    }  
} 
