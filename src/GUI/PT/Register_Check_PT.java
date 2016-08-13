
package GUI.PT;

import GUI.ConnectionManager;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Register_Check_PT {
    public static void CoRegister(int new_id, String sname, String fname, 
            String dob1, String email, String password, String gender2, double height, double weight, String activitylevel){
        try{
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO PTMEMBERS "
                            + "VALUES(" + new_id + ", " 
                            + "'" + sname+ "', "
                            + "'" + fname + "', "
                            + "'" + dob1 + "', "
                            + "'" + email + "', "
                            + "'" + password + "', "
                            + "'" + gender2 + "', "
                            + height + ", "
                            + weight + ", "
                            + "'" + activitylevel + "'"
                            + ")");
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }
    
    
    
    
    
    
    public static void AntiSpam(JTextField disp, JTextField ant){
       //Anti Spam function
        int ran1 = (int) (Math.random()*10);
        int ran2 = (int) (Math.random()*10);
        int sum = ran1 + ran2;
        
        disp.setText("What is " + ran1 + " + " + ran2 + " = ?");
        int input = Integer.parseInt(ant.getText());
        if(input == sum){
            ant.setBackground(Color.green);   
        }else{
         JOptionPane.showMessageDialog(null, "Anti-Spam failed.");
                     ant.setBackground(Color.red);
        }
    }
    
}

