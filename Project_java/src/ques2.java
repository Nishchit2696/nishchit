import java.awt.*; 
import java.awt.event.*;  
import javax.swing.*;
import java.sql.*;

public class ques2  extends JFrame implements ActionListener {
 JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];   
    JButton btnview, btndash, btnresult; 
    ButtonGroup bg;  
    int count=0,current=-1, attempted=0,tm; 
    long StartTime, EndTime,seconds,minutes,flag=0;;
    String answer[] = new String[11];
    String ans;
    int a;
      PreparedStatement psmt=null;
       ResultSet rs=null;
    public ques2(){
     
     l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }
        
         btnview=new JButton("ViewNxtQn");
        btndash=new JButton("Models");
        btnresult=new JButton("Result");
       
        btnview.addActionListener(this);
        btndash.addActionListener(this);
        btnresult.addActionListener(this);
        
        add(btnview);add(btndash);add(btnresult);
        
        l.setBounds(30,40,450,20); 
     
        btnview.setBounds(240,240,100,30);
        btndash.setBounds(100,240,100,30);
        btnresult.setBounds(360,240,100,30);
      
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);
        setTitle("Ethics");
    }
     public static void main(String[] args) {
        
        new ques2 ().setVisible(true);
    }
void setnext()  
    {  
        jb[4].setSelected(true);  
        
        try
        {
            ethicsdb d=new ethicsdb();
         
          psmt=d.conn.prepareStatement("select * from ethicsdb");
            if(current==0)  
            {    
                String sql="select * from ethics where QNum=1"; 
               psmt=d.conn.prepareStatement(sql);
               ResultSet rs = psmt.executeQuery(sql); 
               if(rs.next()){  
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1"); 
                String s3 =rs.getString("op2"); 
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
              
                l.setText("Q.1 "+s1); 
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);}
               
            }  
            if(current==1)  
            {  
                String sql="select * from ethicsdb where QNum=2";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery(sql);
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.2 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);
                }
            }  
            if(current==2)  
            {  
                String sql="select * from ethicsdb where QNum=3";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                rs.next();
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.3 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);  
                
            }  
            if(current==3)  
            {  
                String sql="select * from ethicsdb where QNum=4";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qnum");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.4 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);
                }
            }  
            if(current==4)  
            {  
                String sql="select * from ethicsdb where QNum=5";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.5 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5); 
                }
            }  
            if(current==5)  
            {  
                String sql="select * from ethicsdb where QNum=6";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.6 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);  
                }
            }  
            if(current==6)  
            {  
                String sql="select * from ethicsdb where QNum=7";
                psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.7 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5); 
                }
            }  
            if(current==7)  
            {  
                String sql="select * from ethicsdb where QNum=8";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.8 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);  
                }
            }  
            if(current==8)  
            {  
                String sql="select * from ethicsdb where QNum=9";
                 psmt=d.conn.prepareStatement(sql);
                ResultSet rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.9 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5); 
                }
            }  
            if(current==9)  
            {  
                String sql="select * from ethicsdb where QNum=10";
                psmt=d.conn.prepareStatement(sql);
                rs = psmt.executeQuery();
                if(rs.next()){
                String s1 =rs.getString("Qn");
                String s2 =rs.getString("op1");
                String s3 =rs.getString("op2");
                String s4 =rs.getString("op3");
                String s5 =rs.getString("op4");
                l.setText("Q.10 "+s1);  
                jb[0].setText(s2);jb[1].setText(s3);jb[2].setText(s4);jb[3].setText(s5);
                }
            }  
            l.setBounds(30,40,450,20);  
            for(int i=0,j=0;i<=90;i+=30,j++)  
                jb[j].setBounds(50,80+i,200,20);  
        }   
        catch(Exception e)
        {
            System.out.println("setnext\n"+e);
        }
    }  
  void pickrandom()
   
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","");
           

            for(int i=1;i<=10;i++)
            {
               
                    String sql="select * from javadb order by RAND() Limit 10";
                      psmt=con.prepareStatement(sql);
                  ResultSet rs = psmt.executeQuery();
                    rs.next();
                    String s1 =rs.getString("Qn");
                    String s2 =rs.getString("op1");
                    String s3 =rs.getString("op2");
                    String s4 =rs.getString("op3");
                    String s5 =rs.getString("op4");
                    psmt.executeUpdate("insert into ethicsdb values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
                    rs.close();
                    sql="select * from ethicsdb where QNum="+i+"";
                    rs = psmt.executeQuery(sql);
                    rs.next();
                    s1 =rs.getString("corans");
                    psmt.executeUpdate("insert into stuua values("+s1+"')");
                    rs.close();

                
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("pickrandom\n"+e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
       if(e.getSource()==btnview)
    {  current++;
            setnext();
           
    }
       
       if(e.getSource().equals(btndash))
       {
           Models al=new Models();
           al.setLayout(null);
           al.setVisible(true);
           dispose();
       }
       
       if(e.getSource().equals(btnresult))
        {
           EndTime = System.currentTimeMillis();
			EndTime -=StartTime;
			EndTime/=1000; 
            if(EndTime>=60) {
            	seconds = EndTime%60; 
                EndTime/=60;
                flag=1;
                if(EndTime>=60) 
                {
                    flag=2;
                    minutes=EndTime%60;
                    EndTime/=60;
                }
            }
                current++;
                check();
                if(flag==0)
                    tm = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" seconds\nYour Score: "+count+" / 10\nPercentage: "+(count*10));  
                   else if(flag==1)
                    tm = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" minutes "+seconds+" seconds\nYour Score: "+count+" / 10\nPercentage: "+(count*10));     
                   else if(flag==2)
                    tm = JOptionPane.showConfirmDialog(this,"Time taken: "+EndTime+" hours "+minutes+" minutes "+seconds+" seconds\nYour Score: "+count+" / 10\nPercentage: "+(count*10));
                   else
                   {
                	   System.exit(0);
                   }
            }
            }

	void check() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","");
			 java.sql.Statement stmt = con.createStatement();
			 String sq="select corans from ethicsdb";
			 java.sql.ResultSet rs2 = stmt.executeQuery(sq);
			  for(int j=1;j<=10;j++)
	            {
	                rs2.absolute(j);
	                answer[j] = rs2.getString("corans");
	                for(int i=0;i<4;i++) {
	                	if(jb[i].isSelected()) 
	                	{
	                		ans = jb[i].getText();
	                	String s1 = ans;
	                    if(s1.equals(answer[j])) 
	                    {
	                     count+=1;
	                    }
	                }
	                }
	                
	            }
		}
		catch(Exception e) {
			System.out.println("Error :"+e);
		}
    }
}
