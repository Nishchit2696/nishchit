import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class admin extends JFrame implements ActionListener{
    
    JButton btnlogin;
    JLabel lblnum1, lblnum2, lblmessage;
    JTextField txtnum1, txtnum2;
    
    public admin(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,150,400,300);
        setLayout(null);
        
        lblmessage= new JLabel("Admin");
        lblmessage.setBounds(110, 10, 250, 30);
        
        
        lblnum1 = new JLabel ("Username");
        txtnum1 = new JTextField ();
        
        
       lblnum1.setBounds(5,40,150,20);
       txtnum1.setBounds(165,40,150,20);
        
        lblnum2 = new JLabel ("Password");
        txtnum2 = new JTextField ();
        
         lblnum2.setBounds(5,80,150,20);
         txtnum2.setBounds(165,80,150,20);
         
         btnlogin = new JButton ("login");
         btnlogin.setBounds (130, 130, 120, 30);
         
         add(lblnum1);add (txtnum1); add(lblnum2); add(txtnum2);add (btnlogin);add(lblmessage);
         btnlogin.addActionListener(this);
    }
    public static void main(String[] args) {
       new admin().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String userName = txtnum1.getText();
      String password = txtnum2.getText();
      if (userName.trim().equals("admin") && password.trim().equals("admin")) {
        JOptionPane.showMessageDialog(null,"login successful");
      } else {
         JOptionPane.showMessageDialog(null,"unable to login");
      }
      if(e.getSource().equals(btnlogin))
      {
          addModels al=new addModels();
                 al.setLayout(null);
                 al.setVisible(true);
                 dispose();
      }
   }
}
