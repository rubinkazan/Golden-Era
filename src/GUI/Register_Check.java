
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Register_Check {
    
    public static void CoRegister(int new_id, String sname, String fname, String dob1, String email, String password, String gender2 ){
        try{
            String url = "jdbc:derby://localhost:1527/Golden-Era Fitness"; 
            Connection conn = DriverManager.getConnection(url,"jake4954","zak123"); 
            Statement st = conn.createStatement(); 
            st.executeQuery("INSERT INTO MEMBERS " + 
                "VALUES ("  + new_id + ", '" +  sname + "', '" + fname + "', '"  + java.sql.Date.valueOf(dob1) + "','" + email + "','" + password +"','" + gender2 + "')"); 
            conn.close(); 
            
        } catch (Exception e) {
            e.printStackTrace(); 
        }
}
    
}

