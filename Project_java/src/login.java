import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.sql.*;

public class login extends JFrame implements ActionListener{
 JButton btnlogin, btnsign;
    JLabel lblnum1, lblnum2; 
    JTextField txtnum1, txtnum2;
     JLabel lblmessage;
    
    
    public login() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds (400, 150, 400, 300);
        setLayout (null);
        
        lblmessage= new JLabel("user");
        lblmessage.setBounds(110, 10, 250, 30);
        
        
        lblnum1 = new JLabel ("Username");
        txtnum1 = new JTextField ();
        
        
       lblnum1.setBounds(5,40,150,20);
       txtnum1.setBounds(165,40,150,20);
        
        lblnum2 = new JLabel ("Token id");
        txtnum2 = new JTextField ();
        
        
         lblnum2.setBounds(5,80,150,20);
         txtnum2.setBounds(165,80,150,20);
         
         btnlogin = new JButton ("login");
         btnlogin.setBounds (130, 130, 120, 30);
         
          btnsign= new JButton ("Register");
          btnsign.setBounds(130, 180, 120, 30);
         
         add(lblnum1);add (txtnum1); add(lblnum2); add(txtnum2);add (btnlogin);add(lblmessage);add(btnsign); 
         
         btnlogin.addActionListener(this);
         btnsign.addActionListener(this);
    }
    public static void main(String[] args) {
       new login().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        String token=txtnum2.getText();
        String username = txtnum1.getText();
        
        
          if(e.getSource()==btnlogin)
        {
                database db=new database();
                
                if(db.username.equals(username)||db.token.equals(token))
                {
                    JOptionPane.showMessageDialog(null,"login successful");
                    dispose();
                    Models m= new Models();
                    m.setLayout(null);
                    m.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to login");
                }
                
                 Models al=new Models();
                 al.setLayout(null);
                 al.setVisible(true);
                 dispose();
            
        }
          
          
           if(e.getSource().equals(btnsign))
       {
           signup al=new signup();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
   
    }
}
