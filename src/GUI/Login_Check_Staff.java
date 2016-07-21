
package GUI;


import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Check_Staff {
    
    public static void CoLogin(int username, String password){

        try{
            int dbuser = 0;
            String dbpass = "";
            String url = "jdbc:derby://localhost:1527/Golden-Era Fitness";
            int user = username;
            String pass = password;
           
            Connection con = DriverManager.getConnection(url, "jake4954", "zak123");

            Statement stmt = con.createStatement();
            String SQL = "SELECT * FROM STAFF WHERE ID=" + user + " AND PASSWORD='" + pass + "'";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                dbuser = Integer.parseInt(rs.getString("ID"));
                dbpass = rs.getString("PASSWORD");
                
            }
                   
            if(user == dbuser && (pass.equals(dbpass))){
                     Main_Staff x = new Main_Staff();
                     x.setVisible(true);
            } 
            else{
                Login x = new Login();
                x.setVisible(true);
            }
        }
        
        catch(SQLException error){
            error.printStackTrace();
        }
       
        
    }
    
   
}
