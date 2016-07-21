
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Config {
    public static int idno = 0;
    public static String fname = null;
    public static String sname = null;
    private static Connection con; 
    public static Statement stmt; 
    
    public void test(){
            String url = "jdbc:derby://localhost:1527/Golden-Era Fitness";
            int user = idno;

             con = DriverManager.getConnection(url, "jake4954", "zak123");
                         stmt = con.createStatement();

}
    
}
