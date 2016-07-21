
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Members_Table extends javax.swing.JFrame {

 
    public Members_Table() {
        initComponents();
    }
    //Temporary until i fgiure out how to call this from Config.java
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
             Connection con = getConnection();
              
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
          
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Golden-Era FitnessPU").createEntityManager();
        membersQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery.getResultList();
        membersQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m FROM Members m");
        membersList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery1.getResultList();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtSname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnDelete.setText("Delete");

        jLabel1.setText("ID");

        txtSname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Surname");

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("DOB (YY-MM-DD)");

        jLabel5.setText("Gender");

        jLabel6.setText("Password");

        jLabel7.setText("Email");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, membersList1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${surname}"));
        columnBinding.setColumnName("Surname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dob}"));
        columnBinding.setColumnName("Dob");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${password}"));
        columnBinding.setColumnName("Password");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(Character.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtSname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGender)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addComponent(btnRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnameActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        txtid.setText(model.getValueAt(i,0).toString());
        txtSname.setText(model.getValueAt(i,1).toString());
        txtFname.setText(model.getValueAt(i,2).toString());
        txtDOB.setText(model.getValueAt(i,3).toString());
        txtEmail.setText(model.getValueAt(i,4).toString());
        txtPassword.setText(model.getValueAt(i,5).toString());
        txtGender.setText(model.getValueAt(i,6).toString());
       

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String query = "INSERT INTO MEMBERS " + 
                "VALUES (" + Integer.parseInt(txtid.getText()) + ", '" +  txtSname.getText() + "','" + txtFname.getText() + "', '"  + txtDOB.getText()) + "','" + txtEmail.getText() + "','" + txtPassword.getText() + "','" + txtGender.getText() + "'" + ")"; 
            
    }//GEN-LAST:event_btnRegisterActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<GUI.Members> membersList;
    private java.util.List<GUI.Members> membersList1;
    private javax.persistence.Query membersQuery;
    private javax.persistence.Query membersQuery1;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSname;
    private javax.swing.JTextField txtid;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
