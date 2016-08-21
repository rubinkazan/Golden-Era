
package GUI;

import GUI.PT.*;
import GUI.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.WindowConstants;


public class AboutNeutral extends javax.swing.JFrame {


    public AboutNeutral() {
        initComponents();
               this.getContentPane().setBackground(Color.white);
                       setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblClose = new javax.swing.JLabel();
        lblTOPBAR = new javax.swing.JLabel();
        lblMinimi = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblClose.setText(" ");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblTOPBAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barmain.png"))); // NOI18N
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
                .addContainerGap(656, Short.MAX_VALUE)
                .addComponent(lblMinimi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(lblTOPBAR, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMinimi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClose))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(lblTOPBAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1.setLayer(lblClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTOPBAR, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblMinimi, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnHelp.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnHelp.setText("Help (?)");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jButton1.setText("About - Golden Era Fitness");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnReturn.setText("Return to Login");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        btnRead.setText("About - Read");
        btnRead.setToolTipText("Read about Golden Era Fitness");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 0, 18)); // NOI18N
        jLabel2.setText("About");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallerlogo.png"))); // NOI18N

        txaDisplay.setColumns(20);
        txaDisplay.setRows(5);
        jScrollPane1.setViewportView(txaDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(103, 103, 103)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRead)
                                .addGap(164, 164, 164)))
                        .addComponent(btnHelp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btnRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnReturn)
                    .addComponent(btnHelp)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
           //Takes user to netural help page (independant of Members/PT Members)

        HelpNeutral x = new HelpNeutral();
x.setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           //Takes user to netural about page (independant of Members/PT Members)

AboutNeutral x = new AboutNeutral();
x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
      Login x = new Login();
      x.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
//reads from a textfile
        try
{
    Scanner x = new Scanner(new File("About.txt"));
    while(x.hasNext())
    {
        String name = x.next();
        txaDisplay.append(name);
    }
    x.close();
}

catch(FileNotFoundException f)
{
txaDisplay.append("File not found");
System.exit(0);
}
    }//GEN-LAST:event_btnReadActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblTOPBARMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTOPBARMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //System.out.println(x + "," + y);
        this.setLocation(x,y);
    }//GEN-LAST:event_lblTOPBARMouseDragged

    private void lblMinimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimiMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_lblMinimiMouseClicked

    private void lblTOPBARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTOPBARMouseClicked
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //System.out.println(x + "," + y);
        this.setLocation(x,y);    }//GEN-LAST:event_lblTOPBARMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutNeutral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimi;
    private javax.swing.JLabel lblTOPBAR;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
