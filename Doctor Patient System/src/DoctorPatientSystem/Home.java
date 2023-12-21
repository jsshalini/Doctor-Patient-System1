package DoctorPatientSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.sql.*;
public class Home extends JFrame implements ActionListener {
     JLabel l1;
    JButton b1,b3;
  
    Home(){
        setTitle("DOCTOR PATIENT SYSTEM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/download.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);
        
        l1 = new JLabel("DOCTOR PATIENT SYSTEM");
        l1.setFont(new Font("Osward", Font.BOLD, 28));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        b1 = new JButton("DOCTOR");
        b1.setBackground(Color.gray);
        b1.setForeground(Color.WHITE);
        b1.setBounds(90,180,230,60);
        add(b1);
        
        b3 = new JButton("PATIENT");
        b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
        b3.setBounds(350,180,230,60);
        add(b3);
        setLayout(null);
        
        b1.addActionListener(this);
        b3.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
    }    
         public void actionPerformed(ActionEvent ae)
         {
                
            if(ae.getSource()==b1)
            {
                setVisible(false);
                new DOCTOR();
               
            }
            if(ae.getSource()==b3)
            {
                setVisible(false);
                new PATIENT();
            }
        
        }


   
    public static void main(String[] args)
    {
        new Home().setVisible(true);
    }
}

    


