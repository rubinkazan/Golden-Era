
package GUI.USR;


import GUI.USR.Help;
import GUI.*;
import GUI.USR.Workout_Programs;
import GUI.UserInfoManager;
import java.awt.Desktop;

import java.io.IOException;
import java.net.URI;
import javax.swing.WindowConstants;

public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
                setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        UserInfoManager userInfoManager
                            = UserInfoManager.getInstance();
        welcomeLbl.setText("Welcome, " + userInfoManager.getName());
        

        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcomeLbl = new javax.swing.JLabel();
        btnHelp1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnWP = new javax.swing.JButton();
        btnExercises = new javax.swing.JButton();
        btnBMICalc = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblClose = new javax.swing.JLabel();
        lblTOPBAR = new javax.swing.JLabel();
        lblMinimi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logomain1.png"))); // NOI18N
        jLabel1.setText(" ");

        welcomeLbl.setFont(new java.awt.Font("Heiti TC", 1, 13)); // NOI18N
        welcomeLbl.setText("Welcome, ");

        btnHelp1.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnHelp1.setText("Help (?)");
        btnHelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jButton1.setText("About - Golden Era Fitness");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hiragino Kaku Gothic Std", 0, 18)); // NOI18N
        jLabel2.setText("Main Menu");

        jButton4.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jButton4.setText("Enquire about Personal Trainer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jButton5.setText("View Progress");
        jButton5.setToolTipText("View your Fitness progress!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnWP.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnWP.setText("Workout Programs");
        btnWP.setToolTipText("Browse the Official Bodybuilding workout plans");
        btnWP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWPActionPerformed(evt);
            }
        });

        btnExercises.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnExercises.setText("Exercises Library");
        btnExercises.setToolTipText("Learn a new Exercise!");
        btnExercises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExercisesActionPerformed(evt);
            }
        });

        btnBMICalc.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnBMICalc.setText("BMI Calculator");
        btnBMICalc.setToolTipText("Calculate your BMI!");
        btnBMICalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBMICalcActionPerformed(evt);
            }
        });

        lblClose.setText(" ");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblTOPBAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barmain.png"))); // NOI18N

        lblMinimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(668, Short.MAX_VALUE)
                .addComponent(lblMinimi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(lblTOPBAR, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMinimi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClose))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(lblTOPBAR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(lblClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTOPBAR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblMinimi, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBMICalc)
                    .addComponent(btnWP)
                    .addComponent(btnExercises, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2))
                .addGap(118, 118, 118)
                .addComponent(btnHelp1)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExercises)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBMICalc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(btnHelp1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        About x = new About();
        x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp1ActionPerformed
        Help x = new Help();
        x.setVisible(true);
    }//GEN-LAST:event_btnHelp1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //Opens Mail client
        mailKing();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnExercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExercisesActionPerformed
        Exercises_Library x = new Exercises_Library();
        x.setVisible(true);
    }//GEN-LAST:event_btnExercisesActionPerformed

    private void btnWPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWPActionPerformed
        Workout_Programs x = new Workout_Programs();
        x.setVisible(true);
    }//GEN-LAST:event_btnWPActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Progress x = new Progress();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBMICalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBMICalcActionPerformed
        BMI_Calculator x = new BMI_Calculator();
        x.setVisible(true);
    }//GEN-LAST:event_btnBMICalcActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimiMouseClicked
        this.setState(Main.ICONIFIED);
    }//GEN-LAST:event_lblMinimiMouseClicked

 public void mailKing(){
        Desktop desktop = Desktop.getDesktop();

        try{
            desktop.mail();
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            String msg = "mailto:PersonalTrainer@GoldenEra.com?subject=Personal%20Trainer";
            URI uri = URI.create(msg);
            desktop.mail(uri);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
 
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBMICalc;
    private javax.swing.JButton btnExercises;
    private javax.swing.JButton btnHelp1;
    private javax.swing.JButton btnWP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimi;
    private javax.swing.JLabel lblTOPBAR;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
 
}
