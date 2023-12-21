package DoctorPatientSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class DOCTOR  extends JFrame implements ActionListener{
     JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    DOCTOR(){
        setTitle("DOCTOR PATIENT SYSTEM");
        
       
        
        l1 = new JLabel("DOCTOR LOGIN");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("Email:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l3 = new JLabel("Passward");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);
                
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
      
        
        setLayout(null);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,300,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,300,100,30);
        add(b2);
        
      
        b1.addActionListener(this);
        b2.addActionListener(this);
     
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
   public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==b1){
                Conn c1 = new Conn();
                String Email = tf1.getText();
                String Passward  = pf2.getText();
                String q  = "select * from login where Email = '"+Email+"' and Passward = '"+Passward+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Admin();
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Email Number or Passward");
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   
    
    public static void main(String[] args){
        new DOCTOR().setVisible(true);
    }

    
}

