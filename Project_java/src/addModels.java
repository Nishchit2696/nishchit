import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class addModels extends JFrame implements ActionListener
{
    
    
    JButton btnjava, btnpython, btnenglish, btnethics;
    public addModels(){
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
    new addModels().setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource().equals(btnenglish))
       {
           adminenglish al=new adminenglish();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
          if(e.getSource().equals(btnjava))
       {
           adminjava al=new adminjava();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
           if(e.getSource().equals(btnethics))
       {
           adminethics al=new adminethics();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
            if(e.getSource().equals(btnpython))
       {
           adminpython al=new adminpython();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
      
    }
    
}
