package GUI.STAFF;

import GUI.ConnectionManager;
import GUI.STAFF.Main_Staff;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MembersTable extends JFrame {

    private DefaultTableModel dataModel;
    
    public MembersTable() {
        initComponents();
            this.getContentPane().setBackground(Color.white);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        dataModel = (DefaultTableModel) membersTable.getModel();
        populateDataTable("SELECT * FROM MEMBERS");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        btnMain = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnInsert = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblTOPBAR = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        membersTable.setFont(new java.awt.Font("Heiti SC", 0, 10)); // NOI18N
        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Email", "DOB", "Gender"
            }
        ));
        jScrollPane1.setViewportView(membersTable);

        btnMain.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnMain.setText("Return to Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnInsert.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        selectBtn.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(selectBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel7.setText("Password");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel3.setText("Surname");

        jLabel1.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel4.setText("Email");

        jLabel6.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel6.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jLabel5.setText("DOB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(passwordField)
                    .addComponent(surnameField)
                    .addComponent(nameField)
                    .addComponent(idField)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(emailField)
                            .addComponent(dobField)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTOPBAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/longbar-table.png"))); // NOI18N
        lblTOPBAR.setMaximumSize(new java.awt.Dimension(893, 20));
        lblTOPBAR.setMinimumSize(new java.awt.Dimension(893, 20));
        lblTOPBAR.setPreferredSize(new java.awt.Dimension(893, 20));
        jLayeredPane1.add(lblTOPBAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        lblClose.setText(" ");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jLayeredPane1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 0, 20, -1));

        lblMinimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimiMouseClicked(evt);
            }
        });
        jLayeredPane1.add(lblMinimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 14, 14));

        jLabel8.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 18)); // NOI18N
        jLabel8.setText("Members Table Administration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnMain)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMain))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        //Insert using SQL statement    
        try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO MEMBERS "
                            + "VALUES(" + idField.getText() + ", " 
                            + "'" + surnameField.getText() + "', "
                            + "'" + nameField.getText() + "', "
                            + "'" + dobField.getText() + "', "
                            + "'" + emailField.getText() + "', "
                            + "'" + passwordField.getText() + "', "
                            + "'" + genderField.getText() + "'"
                            + ")");
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
                    populateDataTable("SELECT * FROM MEMBERS");
                    

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Delete using SQL Statements
        String id = JOptionPane.showInputDialog(null, "ID to delete");
        
                try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("DELETE FROM MEMBERS WHERE ID="
                            + id);
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Deleted record");
                    populateDataTable("SELECT * FROM MEMBERS");

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Search using SQL statements
        String searchTerm = JOptionPane.showInputDialog(null, "Enter Search Term");
        populateDataTable("SELECT * FROM MEMBERS WHERE NAME LIKE '%" 
                + searchTerm + "%' OR SURNAME LIKE '%" + searchTerm + "%'");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Update using SQL Statements
        try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("UPDATE MEMBERS "
                            + "SET "
                            + "SURNAME='" + surnameField.getText() + "', "
                            + "NAME='" + nameField.getText() + "', "
                            + "DOB='" + dobField.getText() + "', "
                            + "EMAIL='" + emailField.getText() + "', "
                            + "GENDER='" + genderField.getText() + "'"
                            + " WHERE ID=" + idField.getText());
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
                    populateDataTable("SELECT * FROM MEMBERS");
                    

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        //Selects all fields from the table
        int row = membersTable.getSelectedRow();
        if(membersTable.getSelectedRow() > -1){
            idField.setText(dataModel.getValueAt(row, 0) + "");
            nameField.setText((String)dataModel.getValueAt(row, 1));
            surnameField.setText((String)dataModel.getValueAt(row, 2));
            emailField.setText((String)dataModel.getValueAt(row, 3));
            dobField.setText((String)dataModel.getValueAt(row, 4));
            genderField.setText((String)dataModel.getValueAt(row, 5));
            
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
          Main_Staff x = new Main_Staff();
        x.setVisible(true);

    }//GEN-LAST:event_btnMainActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimiMouseClicked
        this.setState(MembersTable.ICONIFIED);
    }//GEN-LAST:event_lblMinimiMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembersTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersTable().setVisible(true);
            }
        });
    }
    
    private void populateDataTable(String sql){
        
        if (dataModel.getRowCount() > 0) {
            for (int i = dataModel.getRowCount() - 1; i > -1; i--) {
                dataModel.removeRow(i);
            }
        }   
        
        Object rowData[] = new Object[6];
        try {

            Connection connection;
            connection = ConnectionManager.getInstance().getConnection();

            PreparedStatement preparedStatement 
                    = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                rowData[0] = resultSet.getInt("ID");
                rowData[1] = resultSet.getString("NAME");
                rowData[2] = resultSet.getString("SURNAME");
                rowData[3] = resultSet.getString("EMAIL");
                rowData[4] = resultSet.getString("DOB");
                rowData[5] = resultSet.getString("GENDER");

                dataModel.addRow(rowData);
            }

        }catch (SQLException sqlExcep){
            sqlExcep.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField genderField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimi;
    private javax.swing.JLabel lblTOPBAR;
    private javax.swing.JTable membersTable;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton selectBtn;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
