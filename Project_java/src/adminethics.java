import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class adminethics extends JFrame implements ActionListener{
    
    JLabel QNum,Qn,op1,op2,op3,op4,corans;
    JTextField  txQNum,txQn,txop1,txop2,txop3,txop4,txcorans;
    JButton btnques,btnback;
    
    public adminethics (){
        
      setTitle("Add Ethics");
         setLayout(null);
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         QNum=new JLabel("QuesNO: -");
         txQNum=new JTextField();
        
         QNum.setBounds(5,10,100,30);
         txQNum.setBounds(110,10,150,30);
         
         Qn=new JLabel("Questions");
         txQn=new JTextField();
         
          Qn.setBounds(5,60,100,30);
          txQn.setBounds(110,60,150,30);
         
        op1=new JLabel("Option1");
        txop1=new JTextField();
        
         op1.setBounds(5,110,100,30);
          txop1.setBounds(110,110,150,30);
          
        op2=new JLabel("Option2");
        txop2=new JTextField();
        
        op2.setBounds(5,160,100,30);
         txop2.setBounds(110,160,150,30);
         
        op3=new JLabel("Option3");
         txop3=new JTextField();
         
         op3.setBounds(5,210,100,30);
         txop3.setBounds(110,210,150,30);
         
        op4=new JLabel("Option4");
        txop4=new JTextField();
        
        op4.setBounds(5,260,100,30);
        txop4.setBounds(110,260,150,30);
        
        corans=new JLabel("Insert Correct ans");
        txcorans=new JTextField();
        
        corans.setBounds(5,310,100, 30);
        txcorans.setBounds(110,310,150, 30);
        
        
        add(QNum); add(Qn);add(op1);add(op2);add(op3);add(op4);add(corans);add(txQNum); add(txQn);add(txop1);add(txop2);add(txop3);add(txop4);add(txcorans);
        
        btnques=new JButton("Add Ques");
          btnback = new JButton("Back");
        
           btnques.setBounds(150,400,150,30);
           btnback.setBounds(350, 400, 200,30);
           
           
           add(btnques);add(btnback);
           
           btnques.addActionListener(this);
           btnback.addActionListener(this);
    
    
        
            
    }
    public static void main(String[] args) {
        
        new adminethics().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnques))
       {
          try{
        ethicsdb db = new ethicsdb();
           db.QuesOpt(txQNum.getText(),txQn.getText(), txop1.getText(),txop2.getText(),txop3.getText(),txop4.getText(),txcorans.getText());
       
       }catch (Exception ae){
       
       }
       }
       if(e.getSource().equals(btnques))
       {
        new adminethics();
       }
        if(e.getSource().equals(btnback))
       {
           addModels al=new addModels();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
    }

    
}
