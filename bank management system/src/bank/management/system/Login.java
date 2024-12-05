
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login ,clear ,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("AUTOMATED TEKKER MACHINE");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label1 = new JLabel(i3);
        label1.setBounds(70,10,100,100);
        add(label1);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("osward" , Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card No: ");
        cardno.setFont(new Font("Raleway" , Font.BOLD,28));
        cardno.setBounds(120,150,250,40);
        add(cardno);
        
        cardTextField =  new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway" , Font.BOLD,28));
        pin.setBounds(120,220,250,40);
        add(pin);
        
        pinTextField =  new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
      
         clear = new JButton("CLEAR");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
     
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        setLayout(null);
        setLocation(350,200);
        setSize(800,480);
        setVisible(true);
        getContentPane().setBackground(WHITE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
//            cardTextField.setText();
//             pinTextField
        
        }
        else if(e.getSource()==signup){
//            cardTextField=
//             pinTextField=
        }
        
        else if(e.getSource()==clear){
            cardTextField.setText(" ");
            pinTextField.setText(" ");
        }
    }
    public static void main(String arg[]){
         new Login();
    }
    
    
}
