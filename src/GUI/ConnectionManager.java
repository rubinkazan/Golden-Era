
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionManager implements Runnable{

    private static ConnectionManager connectionManager = new ConnectionManager();
    
    private Connection connection;
    private String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private String protocol = "jdbc:derby:";
    private String databaseName = "usr/database";
    String url = "jdbc:derby://localhost:1527/Golden-Era Fitness";

    private ConnectionManager(   ) {
    }
    
    public static ConnectionManager getInstance(){
        return connectionManager;
    }

   
    public ConnectionManager(String driver, String protocol, String databaseName) {
        this.driver = driver;
        this.protocol = protocol;
        this.databaseName = databaseName;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect(){
       
        try{
            connection = DriverManager.getConnection(url, "jake4954", "zak123");
            System.out.println("Connected to database");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
       
    }

    @Override
    public void run() {
        try {
            Class.forName(driver).newInstance();

            connection = DriverManager.getConnection(url, "jake4954", "zak123");
            System.out.println("Connected to database");

        }catch (SQLException sqlExcep){
            sqlExcep.printStackTrace();
            displayErrorMessage("Could not establish connection to database \n" +
                    "SQL Exception");
        }catch (ClassNotFoundException cnfExcep){
            cnfExcep.printStackTrace();
            displayErrorMessage("Could not establish connection to database \n" +
                    "Class Not Found Exception");
        }catch (Exception excep){
            excep.printStackTrace();
            displayErrorMessage("Could not establish connection to database \n" +
                    "Exception");
        }
    }

    private void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(null, errorMessage);
    }
}