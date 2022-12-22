//Section: E ID: 22-47226-1

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
//import static javax.swing.JOptionPane.showMessageDialog;  //its already imported via javax.swing.*

class Welcome implements ActionListener
{  
		JFrame f;
		
		ImageIcon i1;
		ImageIcon i2;

		JLabel l1;
		JLabel l2;
		JLabel l3;
		JLabel l4;
		
		JTextField tf1;
		JTextField tf2;
		JTextField tf3;
		
		JButton b1;
		JButton b2;
		JButton b3;
		
		Welcome(int a, int b, int c) //passing 3 values for RGB color code for frame background
		{  
			
			f= new JFrame(); 

			i1 = new ImageIcon("Sources/pic.png");
        	i2 = new ImageIcon("Sources/ok.png");
			
			l1 = new JLabel("Welcome");
			l1.setFont(new Font("Comic Sans MS",Font.BOLD, 20));
			l1.setForeground( new Color (0, 247, 87) );
			l1.setBounds(240,70,300,20); 
			
			l2 = new JLabel("Red    Green    Blue");
			l2.setFont(new Font("Comic Sans MS",Font.BOLD, 15));
			l2.setForeground( new Color (0, 247, 87) );
			l2.setBounds(208,115,300,20); 
			
			l3 = new JLabel("Enter RGB values respictively below (from 0-255).");
			l3.setFont(new Font("Comic Sans MS",Font.BOLD, 15));
			l3.setForeground( new Color (0, 247, 87) );
			l3.setBounds(110,92,380,20); 

			l4 = new JLabel();
			l4.setIcon(i2);
			l4.setBounds(200,200,170,170);
			
			tf1 = new JTextField();  
	        tf1.setBounds(198,140,45,23);  
	        
	        tf2 = new JTextField();  
	        tf2.setBounds(260,140,45,23);  
	        
	        tf3 = new JTextField();  
	        tf3.setBounds(323,140,45,23);  
			
			b1 = new JButton("Previous");
			b1.setBounds(20,20,85,20);  
	        b1.addActionListener(this);
	        
	        b2 = new JButton("Exit");
			b2.setBounds(480,20,85,20);  
	        b2.addActionListener(this);
	        
	        b3 = new JButton("Change Backgound");
			b3.setBounds(210,170,150,20);  
	        b3.addActionListener(this);
		
			f.add(l1);
			f.add(l2);
			f.add(l3);
			f.add(l4);
			f.add(tf1);
			f.add(tf2);
			f.add(tf3);
			f.add(b1);
			f.add(b2);
			f.add(b3);
        
			f.setSize(600,650);  
			f.setLayout(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setIconImage( i1.getImage() );
			f.getContentPane().setBackground( new Color (a, b, c));
			f.setTitle("______________________________________Welcome______________________________________");
			f.setResizable(false);
			f.setLocationRelativeTo(null);
			f.setVisible(true);  
    	}
		
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b1)
			{
				new UserLogin(); //opens a new Login page and clears the Welcome window
				f.dispose();
			}
			
			if(e.getSource()==b2)
			{
				System.exit(0);
			}
			
			if(e.getSource()==b3)
			{
				String r = tf1.getText();
				String g = tf2.getText();
				String b = tf3.getText();
				
				int r1 = 0;
				int r2 = 0;
				int r3 = 0;
				
				if(r.isEmpty()!=true) {r1 = Integer.parseInt(r);}                     //checking and assigning the int value if strings were not empty
				
				if(g.isEmpty()!=true) {r2 = Integer.parseInt(g);}
				
				if(b.isEmpty()!=true) {r3 = Integer.parseInt(b);}
				
				if( (r1>=0 && r1<=255) && (r2>=0 && r2<=255) && (r3>=0 && r3<=255) )  //checking the range (0-255)
				{
						f.dispose();
						new Welcome(r1,r2,r3);
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"Number must be INTEGERS and from 0-255");
				}
			}
		}             
}
