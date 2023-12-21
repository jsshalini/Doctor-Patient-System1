package DoctorPatientSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame implements ActionListener{

    JButton view, block, update, booking;
    
    Admin() {
        
        setLayout(null);
        
      
        JLabel heading = new JLabel("DOCTOR PATIENT SYSTEM");
        heading.setBounds(550, 20, 380, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 30));
       add(heading);
        
        view = new JButton("View Patient");
        view.setBounds(650, 80, 150, 40);
        view.addActionListener(this);
       add(view);
        
        update = new JButton("Update Patient");
        update.setBounds(820, 80, 150, 40);
        update.addActionListener(this);
    add(update);
        
        block = new JButton("Block Patient");
        block.setBounds(650, 140, 150, 40);
        block.addActionListener(this);
    add(block);
        
        booking= new JButton("Booking calender ");
        booking.setBounds(820, 140, 150, 40);
        booking.addActionListener(this);
        add(booking);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == view) {
            setVisible(false);
          new View();
        } else if (ae.getSource() == update) {
            setVisible(false);
         //  new update();
        } else if (ae.getSource() == block) {
            setVisible(false);
          //  new block();
        } else if(ae.getSource()==booking) {
            setVisible(false);
          // new Booking();
        }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
