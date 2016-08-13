
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Stat_Check {
    
     public static void checkStat(int id, double squat, double benchPress, double deadLift, double weight){
        try{
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO STATS "
                            + "VALUES(" + id + ", " 
                            + squat + ", " + benchPress + ", "
                            + deadLift + ", "
                            + weight
                            + ")");
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }
     
     public double[] getCount(double id, double squat, double bench, double deadlift, double weight) throws SQLException{
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
                    Connection connection = connectionManager.getConnection();
                    Statement stmt = connection.createStatement();
                    
                    //String sql = "SELECT \"SQUAT\", \"BENCH\", \"DEADLIFT\" FROM \"STATS\"" //where id == getid();
         return null;
                    
                                   
                    
         
         
         
         
     }
     
     
     

             
     
     
     
     
     
     
     
     
}
