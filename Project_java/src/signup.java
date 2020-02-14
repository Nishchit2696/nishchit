import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class signup extends JFrame implements ActionListener{
    
    JButton btnlogin, btnback;
    JLabel lblnum1, lblnum2, lblmessage, Lblnum3, lblnum4;
    JTextField txtnum1, txtnum2, txtnum3;
    
    public signup() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,150,400,300);
        setLayout(null);
        
        lblmessage= new JLabel("Register");
        lblmessage.setBounds(110, 10, 250, 30);
        
        
        lblnum1 = new JLabel ("Username");
        txtnum1 = new JTextField ();
        
        
       lblnum1.setBounds(5,40,150,20);
       txtnum1.setBounds(165,40,150,20);
        
        lblnum2 = new JLabel ("email");
        txtnum2 = new JTextField ();
        
         lblnum2.setBounds(5,80,150,20);
         txtnum2.setBounds(165,80,150,20);
         
         lblnum4 =new JLabel("Token");
         lblnum4.setBounds(5, 110, 120, 30);
         
         
         Lblnum3 = new JLabel("Token");
         
         
         Lblnum3.setBounds(165, 110, 150, 20);
         
         
         btnlogin = new JButton ("Register");
         btnlogin.setBounds (50, 160, 120, 30);
         
         btnback = new JButton ("login");
         btnback.setBounds (210, 160, 120, 30);
         btnback.addActionListener(this);
         
         btnlogin.addActionListener(this);
        
         
         add(lblnum1);add (txtnum1); add(lblnum2); add(txtnum2);add (btnlogin);add(lblmessage);add (btnback);add (Lblnum3);add (lblnum4);
         
         Random r = new Random();
        int ran = r.nextInt(1000);
        Lblnum3.setText(Integer.toString(ran));   
        
                 
                 
    }
    public static void main(String[] args) {
       
       new signup().setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==btnlogin)
        {
                database db=new database();
                int result=db.save(txtnum1.getText(),txtnum2.getText(),Lblnum3.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null,"Saved");
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
            
            
        }
        
        if(e.getSource().equals(btnback))
       {
           login al=new login();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
   
    }
    
    
}
