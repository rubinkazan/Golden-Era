
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Stat_Check {
    
     public static void checkStat(int id, double squat, double benchPress, double deadLift){
        try{
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO STATS "
                            + "VALUES(" + id + ", " 
                            + squat + ", " + benchPress + ", "
                            + deadLift
                            + ")");
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }
}
