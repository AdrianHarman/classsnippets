package GUI;

import javax.swing.*;

import java.awt.*;
import javax.swing.filechooser.*;
import java.awt.event.ActionEvent;
//import java.awt.*;
//import java.sql.*;
import java.awt.event.ActionListener;

 
public class Login extends JFrame implements ActionListener 
  { 
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1, btn2;
    JPasswordField p1;
    JFileChooser fc;
    
   
 
 public   Login()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
 
        l1 = new JLabel("Login Details");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Username:");
        l3 = new JLabel("Password:");
        tf1 = new JTextField();
        p1 = new JPasswordField();
      
		btn1 = new JButton("Login");
        btn2 = new JButton("Register");
        fc = new JFileChooser("Select");
 
        //btn1.addActionListener(this);
        //btn2.addActionListener(this);
 
        l1.setBounds(300, 110, 400, 30);
        l2.setBounds(80, 160, 200, 30);
        l3.setBounds(80, 210, 200, 30);
        tf1.setBounds(300, 160, 200, 30);
        p1.setBounds(300, 210, 200, 30);
        btn1.setBounds(250, 270, 100, 30);
        btn2.setBounds(370, 270, 100, 30);
        fc.setBounds(500, 400, 100, 30);
        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(p1);
        add(btn1);
        add(btn2);
        add(fc);
        
        //actions
       btn2.addActionListener(this);
        
        

    }
 
 
    public static void main(String args[])
   {
        new Login();
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			if(e.getSource()==btn2){
				
				Registration a = new Registration();
				a.setVisible(true);
				this.setVisible(false);
			}
		}



  }



  
