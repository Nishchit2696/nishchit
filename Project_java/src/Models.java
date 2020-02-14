import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Models extends JFrame implements ActionListener
{
    
    
    JButton btnjava, btnpython, btnenglish, btnethics;
    public Models(){
       setTitle("Subject"); 
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setBounds(400,150,400,300);
      setLayout(null);
        
   btnjava = new JButton ("Java");
   btnjava.setBounds (20, 40, 100, 30);
   btnjava.addActionListener(this);
    
    btnpython= new JButton("Python");
    btnpython.setBounds(180, 40, 100, 30);
    btnpython.addActionListener(this);
    
    btnethics = new JButton ("Ethics");
    btnethics.setBounds (20, 80, 100, 30);
    btnethics.addActionListener(this);
    
    btnenglish = new JButton ("English");
    btnenglish.setBounds (180, 80, 100, 30);
    btnenglish.addActionListener(this);
    
    add (btnenglish);add(btnethics);add(btnpython);add(btnjava);
    }
    public static void main(String[] args) {    
    new Models().setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource().equals(btnenglish))
       {
           ques3 al=new ques3();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
          if(e.getSource().equals(btnjava))
       {
           ques1 al=new ques1();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
           if(e.getSource().equals(btnethics))
       {
           ques2 al=new ques2();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
            if(e.getSource().equals(btnpython))
       {
           ques4 al=new ques4();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
      
    }
    
}
