package harrypotter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
     public static Connection mycon(){
     Connection con = null ;     
     try {     
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/harrypotterproject","root","");
         return con; 
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
        }
    }
}
 
 
// 
