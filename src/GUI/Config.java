
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Config {
    private int idno;
    private String fname;
    private String sname;
    private String DOB;
    private String email;
    private String password;
    private String gender;

    public Config(int idno, String fname, String sname, String DOB, String email, String password, String gender) {
        this.idno = idno;
        this.fname = fname;
        this.sname = sname;
        this.DOB = DOB;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public int getIdno() {
        return idno;
    }

    public String getFname() {
        return fname;
    }

    public String getSname() {
        return sname;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public String getGender() {
        return gender;
    }
    
    public Connection getConnection(){
        Connection con;
        String url = "jdbc:derby://localhost:1527/Golden-Era Fitness";
        try{
            con = DriverManager.getConnection(url, "jake4954", "zak123");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
    //https://github.com/rubinkazan/Golden-Era/blob/master/src/GUI/Config.java
    
    //Fetches data from database and stores in ArrayList
    public ArrayList<Config>getMembers(){
        ArrayList<Config>Members = new ArrayList<Config>();
        Connection con = getConnection();
        String query = "SELECT * FROM 'MEMBERS'";
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Config member;
            
            while(rs.next()){
                member = 
                        new Config(rs.getInt("id"), rs.getString("sname"), rs.getString("fname"), 
                                rs.getString("dob"), rs.getString("email"), rs.getString("password"), rs.getString("gender"));
                Members.add(member);
            }
                   
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return Members;
        
        
    }
    

    
    
    
}
