
package GUI.USR;


import GUI.ConnectionManager;
import GUI.UserInfoManager;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Check_Members {
    
    private int dbuser;
    private String dbpass;
    private String dbName = "";
    private String dbSurname = "";
    
    public boolean CoLogin(int username, String password){
        
        boolean loginSuccessful = false;

        try{
         
            //String url = "jdbc:derby://localhost:1527/Golden-Era Fitness";
            //Connection con = DriverManager.getConnection(url, "jake4954", "zak123");
            dbuser = 0;
            dbpass = "";
            
            int user = username;
            String pass = password;
            
            Connection connection;
            
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            connection = connectionManager.getConnection();

            Statement stmt = connection.createStatement();
            
            String SQL = "SELECT * FROM MEMBERS WHERE ID=" + user 
                    + " AND PASSWORD='" + pass + "'";
            ResultSet rs = stmt.executeQuery(SQL);

            while(rs.next()){
                dbuser = Integer.parseInt(rs.getString("ID"));
                dbpass = rs.getString("PASSWORD");  
                dbName = rs.getString("NAME");
                dbSurname = rs.getString("SURNAME");
            }
                   
            if(user == dbuser && (pass.equals(dbpass))){
                    loginSuccessful = true;
                    
                    UserInfoManager userInfoManager
                            = UserInfoManager.getInstance();
                    
                    userInfoManager.setId(dbuser);
                    userInfoManager.setName(dbName);
                    userInfoManager.setSurname(dbSurname);
                    
                    Main x = new Main();
                    x.setVisible(true);
            } 
            else{
                
            }
        }
        
        catch(SQLException error){
            error.printStackTrace();
        }
       
      
        return loginSuccessful;
    }
    
   
}
