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


public class PTTable extends JFrame {

    private DefaultTableModel dataModel;
    
    public PTTable() {
        initComponents();
            this.getContentPane().setBackground(Color.white);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        dataModel = (DefaultTableModel) ptTable.getModel();
        populateDataTable("SELECT * FROM PTMEMBERS");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ptTable = new javax.swing.JTable();
        btnMain = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        selectBtn = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblClose = new javax.swing.JLabel();
        lblMinimi = new javax.swing.JLabel();
        lblTOPBAR = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        ptTable.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        ptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Email", "DOB", "Gender"
            }
        ));
        jScrollPane1.setViewportView(ptTable);

        btnMain.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnMain.setText("Return to Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnUpdate.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        selectBtn.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        selectBtn.setText("Select");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel7.setText("Password");

        jLabel3.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel3.setText("Surname");

        jLabel8.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel8.setText("Height");

        jLabel6.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel6.setText("Gender");

        jLabel1.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel2.setText("Name");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel4.setText("Email");

        jLabel9.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel9.setText("Weight");

        jLabel5.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel5.setText("DOB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameField)
                                .addComponent(surnameField)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectBtn)
                .addContainerGap())
        );

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setText(" ");
        lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblCloseMouseDragged(evt);
            }
        });
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

        lblTOPBAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/longbar-table.png"))); // NOI18N
        lblTOPBAR.setMaximumSize(new java.awt.Dimension(893, 20));
        lblTOPBAR.setMinimumSize(new java.awt.Dimension(893, 20));
        lblTOPBAR.setPreferredSize(new java.awt.Dimension(893, 20));
        lblTOPBAR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblTOPBARMouseDragged(evt);
            }
        });
        lblTOPBAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTOPBARMouseClicked(evt);
            }
        });
        jLayeredPane1.add(lblTOPBAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel10.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 18)); // NOI18N
        jLabel10.setText("Personal Trainer Members Table Administration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMain)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMain))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
            try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("INSERT INTO PTMEMBERS "
                            + "VALUES(" + idField.getText() + ", " 
                            + "'" + surnameField.getText()+ "', "
                            + "'" + nameField.getText() + "', "
                            + "'" + dobField.getText()+ "', "
                            + "'" + emailField.getText() + "', "
                            + "'" + genderField.getText() + "', "
                            + heightField.getText() + ", "
                            + weightField.getText()
                            + ")");
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
                    populateDataTable("SELECT * FROM PTMEMBERS");
                    

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = JOptionPane.showInputDialog(null, "ID to delete");
        
                try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("DELETE FROM PTMEMBERS WHERE ID="
                            + id);
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Deleted record");
                    populateDataTable("SELECT * FROM PTMEMBERS");

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Search using SQL Statements
        String searchTerm = JOptionPane.showInputDialog("Enter Search Term");
        populateDataTable("SELECT * FROM PTMEMBERS WHERE NAME LIKE '%" 
                + searchTerm + "%' OR SURNAME LIKE '%" + searchTerm + "%'"
                + "OR EMAIL LIKE '%" + searchTerm + "%'"
                + "OR DOB LIKE '%" + searchTerm + "%'");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                //Update using SQL Statements
        try{
            
                    ConnectionManager connectionManager = ConnectionManager.getInstance();
            
                    Connection connection = connectionManager.getConnection();
                    
                    PreparedStatement preparedStatement = 
                    connection.prepareStatement("UPDATE PTMEMBERS "
                            + "SET "
                            + "SURNAME='" + surnameField.getText() + "', "
                            + "NAME='" + nameField.getText() + "', "
                            + "DOB='" + dobField.getText() + "', "
                            + "EMAIL='" + emailField.getText() + "', "
                            + "GENDER='" + genderField.getText() + "', "
                            + "HEIGHT=" + heightField.getText() + ", "
                            + "WEIGHT=" + weightField.getText() + ", "
                            + "WHERE ID=" + idField.getText());
                    
                    preparedStatement.executeUpdate();
                    
                    System.out.println("Inserted record");
                    populateDataTable("SELECT * FROM PTMEMBERS");
                    

            
                }catch(SQLException error){
                    error.printStackTrace();
                }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        int row = ptTable.getSelectedRow();
        if(ptTable.getSelectedRow() > -1){
            idField.setText(dataModel.getValueAt(row, 0) + "");
            nameField.setText((String)dataModel.getValueAt(row, 2));
            surnameField.setText((String)dataModel.getValueAt(row, 1));
            emailField.setText((String)dataModel.getValueAt(row, 4));
            dobField.setText((String)dataModel.getValueAt(row, 3));
            genderField.setText((String)dataModel.getValueAt(row, 5));
            heightField.setText((String)dataModel.getValueAt(row, 6));
            weightField.setText((String)dataModel.getValueAt(row, 7));

            
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
        this.setState(PTTable.ICONIFIED);
    }//GEN-LAST:event_lblMinimiMouseClicked

    private void lblTOPBARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTOPBARMouseClicked

    }//GEN-LAST:event_lblTOPBARMouseClicked

    private void lblTOPBARMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTOPBARMouseDragged
            int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        System.out.println(x + "," + y);
        this.setLocation(x,y);      
    }//GEN-LAST:event_lblTOPBARMouseDragged

    private void lblCloseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCloseMouseDragged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTTable().setVisible(true);
            }
        });
    }
    
    private void populateDataTable(String sql){
        
        if (dataModel.getRowCount() > 0) {
            for (int i = dataModel.getRowCount() - 1; i > -1; i--) {
                dataModel.removeRow(i);
            }
        }   
        
       Object rowData[] = new Object[8];
        try {

            Connection connection;
            connection = ConnectionManager.getInstance().getConnection();

            PreparedStatement preparedStatement 
                    = connection.prepareStatement("SELECT * FROM PTMEMBERS");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                rowData[0] = resultSet.getInt("ID");
                rowData[1] = resultSet.getString("SURNAME");
                rowData[2] = resultSet.getString("NAME");
                rowData[3] = resultSet.getString("DOB");
                rowData[4] = resultSet.getString("EMAIL");
                rowData[5] = resultSet.getString("GENDER");
                rowData[6] = resultSet.getString("HEIGHT");
                rowData[7] = resultSet.getString("WEIGHT");


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
    private javax.swing.JTextField heightField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimi;
    private javax.swing.JLabel lblTOPBAR;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable ptTable;
    private javax.swing.JButton selectBtn;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables
}
