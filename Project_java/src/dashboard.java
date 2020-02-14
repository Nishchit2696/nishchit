
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class dashboard extends JFrame implements ActionListener{
    
       JButton btnadmin, btnuser;
    JLabel lblmessage;
    
    public dashboard (){
    
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setBounds(400,150,400,300);
      setLayout(null);
      
     lblmessage= new JLabel("This is your Dashboard");
      lblmessage.setBounds(110, 30, 250, 30);
      
      btnadmin=new JButton ("Admin");
      btnadmin.setBounds(55, 80, 120, 30);
      btnadmin.addActionListener(this);
      
      btnuser= new JButton ("user");
      btnuser.setBounds(195, 80, 120, 30);
      btnuser.addActionListener(this);
      
     
      
      add(lblmessage);add(btnadmin);add(btnuser);
      
    }

 public static void main(String[] args) {
       new dashboard().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
       if(e.getSource().equals(btnadmin))
       {
           admin al=new admin();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
       
       if(e.getSource().equals(btnuser))
       {
           signup al=new signup();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
    }
}
