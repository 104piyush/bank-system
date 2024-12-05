
package bank.management.system;

import static java.awt.Color.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;

public class SignupOne extends JFrame implements ActionListener {
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JRadioButton male , female,marride , unmarride;
    JButton next; 
    SignupOne(){
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()% 9000L)+1000L);
        JLabel formno = new JLabel("APPLICTION FORM NO."+random);
        formno.setFont(new Font("Raleway" , Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway" , Font.BOLD, 22));
        personDetails.setBounds(290,80,300,40);
        add(personDetails);
        
        
        JLabel name = new JLabel("Name : ");
        JLabel fname = new JLabel("father's name : ");
        JLabel dob = new JLabel("Date of Birth : ");
        JLabel gender = new JLabel("Gender : ");
        JLabel email = new JLabel("Email Address :");
        JLabel marital = new JLabel("Marital Status : ");
        JLabel address = new JLabel("Address : ");
        JLabel city = new JLabel("City :");
        JLabel state = new JLabel("State :");
        JLabel pincode = new JLabel("Pincode :");
        
        
        nameTextField = new JTextField();
        fnameTextField = new JTextField();
        emailTextField = new JTextField();
        addressTextField = new JTextField();
        stateTextField = new JTextField();
        cityTextField = new JTextField();
        addressTextField = new JTextField();
        pinTextField = new JTextField();
        
        
       male = new JRadioButton("male");
       female = new JRadioButton("female");
       male.setBounds(300, 290, 60, 40);
       female.setBounds(450, 290, 120, 40);
       male.setBackground(WHITE);
       female.setBackground(WHITE);
       ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(female);
       add(male);
       add(female);
        
       marride = new JRadioButton("marride");
       unmarride = new JRadioButton("unmarride");
       marride.setBounds(300, 390, 80, 40);
       unmarride.setBounds(450, 390,120, 40);
       marride.setBackground(WHITE);
       unmarride.setBackground(WHITE);
       ButtonGroup marrigegroup = new ButtonGroup();
       marrigegroup.add(marride);
       marrigegroup.add(unmarride);
       add(marride);
       add(unmarride);
        
          name.setFont(new Font("Raleway" , Font.BOLD, 22));
          fname.setFont(new Font("Raleway" , Font.BOLD, 22));
          dob.setFont(new Font("Raleway" , Font.BOLD, 22));
          gender.setFont(new Font("Raleway" , Font.BOLD, 22));
          email.setFont(new Font("Raleway" , Font.BOLD, 22));
          marital.setFont(new Font("Raleway" , Font.BOLD, 22));
          address.setFont(new Font("Raleway" , Font.BOLD, 22));
          city.setFont(new Font("Raleway" , Font.BOLD, 22));
          state.setFont(new Font("Raleway" , Font.BOLD, 22));
          pincode.setFont(new Font("Raleway" , Font.BOLD, 22));
         
          nameTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          fnameTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          emailTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          addressTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          cityTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          stateTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
          pinTextField.setFont(new Font("Raleway" , Font.BOLD, 14));
        
         name.setBounds(100,140,200,30);
         fname.setBounds(100,190,200,30); 
         dob.setBounds(100,240,200,30); 
         gender.setBounds(100,290,200,30);
         email.setBounds(100,340,200,30);
         marital.setBounds(100,390,200,30);
         address.setBounds(100,440,200,30); 
         city.setBounds(100,490,200,30);
         state.setBounds(100,540,200,30);
         pincode.setBounds(100,590,200,30);
         
         
         
         
         nameTextField.setBounds(300,140,400,30);
         fnameTextField.setBounds(300,190,400,30); 
         emailTextField.setBounds(300,340,400,30);
         addressTextField.setBounds(300,440,400,30); 
         cityTextField.setBounds(300,490,400,30);
         stateTextField.setBounds(300,540,400,30);
         pinTextField.setBounds(300,590,400,30);
         
      
         
        add(name);
        add(fname);
        add(dob);
        add(gender);
        add(email);
        add(marital);
        add(address);
        add(city);
        add(state);
        add(pincode);
        
        add(nameTextField);
        add(fnameTextField);
        add(emailTextField);
         add(addressTextField);
        add(cityTextField);
        add(stateTextField);
        add(pinTextField);
        
               
        next =new JButton("Next");
        next.setBackground(BLACK);
        next.setForeground(WHITE);
        next.setFont(new Font("Raleway",Font.BOLD ,14));
        next.setBounds(620,660,80,30);
        add(next);
        

        setSize(850,800);
        setLayout((null));
        setVisible(true);
        setLocation(350,10);
        getContentPane().setBackground(WHITE);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public static void main(String args[]){
        new SignupOne();
    } 

    
}
