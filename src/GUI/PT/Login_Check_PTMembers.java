
package GUI.PT;


import GUI.ConnectionManager;
import GUI.PT.Main_PT;
import GUI.UserInfoManager;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Check_PTMembers {
    
    private int dbuser;
    private String dbpass;
    private String dbName = "";
    private String dbSurname = "";
    
    public boolean CoLogin(int username, String password){
        
        boolean loginSuccessful = false;

        try{
            dbuser = 0;
            dbpass = "";
            
            int user = username;
            String pass = password;
            
            Connection connection;
            
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            connection = connectionManager.getConnection();

            Statement stmt = connection.createStatement();
            
            String SQL = "SELECT * FROM PTMEMBERS WHERE ID=" + user 
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
                    
                    Main_PT x = new Main_PT();
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
