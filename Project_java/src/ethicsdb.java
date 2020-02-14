import java.sql.*;
import javax.swing.JOptionPane;
public class ethicsdb {
 
    public Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    
    
    public ethicsdb(){
      try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","");
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
       public void QuesOpt(String QNum,String Qn,String op1,String op2,String op3,String op4,String corans)
     {
       try {
          String query="INSERT INTO `ethicsdb`(`Qnum`, `Qn`, `op1`, `op2`, `op3`, `op4`, `corans`) VALUES (?,?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(query);
            pstmt.setString(1,QNum);
            pstmt.setString(2,Qn);
             pstmt.setString(3,op1);
             pstmt.setString(4,op2);
             pstmt.setString(5,op3);
             pstmt.setString(6,op4);
              pstmt.setString(7,corans);
//           rs=pstmt.executeQuery();
            if(pstmt.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"NewQuestionAdded");
//                   
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Unable to saved");
                }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
     
     }
     
}

    

