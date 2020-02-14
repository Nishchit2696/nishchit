import java.sql.*;

public class database {
    
     public Connection conn;
    PreparedStatement pstmt;
    String username;
    String token;
    public database()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","");
            String query="select username, token from signup";
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
            String Username=rs.getString(1);
            username= Username;
            String Token= rs.getString(2);
            token= Token;
            
            }
            stmt.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
    }
    
    public int save(String username,String email,String token)
    {
        int result=0;
        try 
        {
            pstmt=conn.prepareStatement("insert into signup values(?,?,?)");
            pstmt.setString(1,username);
            pstmt.setString(2,email);
            pstmt.setString(3,token);
            result=pstmt.executeUpdate();
        } 
        catch (Exception e) 
        {
            System.out.println("Error: "+e);
        }
           
        return result;
        
    }
}
