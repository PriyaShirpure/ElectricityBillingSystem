
package electricitybillingsystem;
import java.sql.*;
public class conn {
    
    Connection c;
    Statement s;
    conn(){
      try{  
         c = DriverManager.getConnection("jdbc:mysql:///ebs","root","priya@232");
         s = c.createStatement();
         
      }catch(Exception e){
          e.printStackTrace();
       }
      }
        

}
    
