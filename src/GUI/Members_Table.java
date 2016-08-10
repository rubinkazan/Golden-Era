
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Members_Table extends JFrame {
    
    //ConnectionManager connectionManager = ConnectionManager.getInstance();

    public Members_Table() {
        initComponents();
    }
    
    /*
    public ArrayList<Config>getMembers(){
            
        ArrayList<Config>Members = new ArrayList<Config>();
        
        //Thread connect 
        Connection connection = connectionManager.getConnection();
        String query = "SELECT * FROM 'MEMBERS'";
        
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Config member;
            
            while(rs.next()){
                member = new Config(rs.getInt("id"), rs.getString("sname"),
                        rs.getString("fname"), rs.getString("dob"),
                        rs.getString("email"), rs.getString("password"), 
                        rs.getString("gender"));
                Members.add(member);
            }
                   
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return Members;    
    }
        
          public void display_members(){
            ArrayList<Config>list = getMembers();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[7];
            
            for (int i = 0; i < list.size(); ++i) {
                row[0] = list.get(i).getIdno();
                row[1] = list.get(i).getSname();
                row[2] = list.get(i).getFname();
                row[3] = list.get(i).getDOB();
                row[4] = list.get(i).getEmail();
                row[5] = list.get(i).getPassword();
                row[6] = list.get(i).getGender();
                
                model.addRow(row);
                
            }            
        }
          public void executeQuery(String query, String msg){
             Connection con = connectionManager.getConnection();
              
              try{
                  Statement stmt = con.createStatement();
                          if((stmt.executeUpdate(query)) == 1){
                              JOptionPane.showMessageDialog(null,"Data " + msg + "Successfully");
                          }
                          else{
                              JOptionPane.showMessageDialog(null,"Data " + msg + "Unsuccessfully");                            
                          }
              }
              catch(Exception e){
                  e.printStackTrace();
                  
              }           
          }
          */
          
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Golden-Era FitnessPU").createEntityManager();
        membersQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery.getResultList();
        membersQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery1.getResultList();
        membersQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery2.getResultList();
        membersQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery3.getResultList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private java.util.List<GUI.Members> membersList;
    private java.util.List<GUI.Members> membersList1;
    private java.util.List<GUI.Members> membersList2;
    private java.util.List<GUI.Members> membersList3;
    private javax.persistence.Query membersQuery;
    private javax.persistence.Query membersQuery1;
    private javax.persistence.Query membersQuery2;
    private javax.persistence.Query membersQuery3;
    // End of variables declaration//GEN-END:variables
}
