
package GUI.PT;

import GUI.USR.*;
import GUI.STAFF.Main_Staff;
import GUI.UserInfoManager;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Exercises_LibraryPT extends javax.swing.JFrame {

    public Exercises_LibraryPT() {
        initComponents();
                setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        UserInfoManager userInfoManager
                            = UserInfoManager.getInstance();
        //Neck
        lblNeck.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/6/muscle/neck"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblTraps.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/11/muscle/traps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblShoulders.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/12/muscle/shoulders"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblChest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/1/muscle/chest"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblBiceps.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/15/muscle/biceps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblForearm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/2/muscle/forearms"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblAbs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/13/muscle/abdominals"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblQuads.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/7/muscle/quadriceps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblCalves.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/9/muscle/calves"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblCalves1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/9/muscle/calves"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblCalves.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/9/muscle/calves"));
                    } catch (Exception excep) {       
                    }
            }
        });
        
        lblHamstrings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/8/muscle/hamstrings"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblQuads1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/7/muscle/quadriceps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblGlutes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("ttp://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/14/muscle/glutes"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblMidBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/4/muscle/middle-back"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblLats.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/3/muscle/lats"));
                    } catch (Exception excep) {       
                    }
            }
        });
         lblLowerBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/5/muscle/lower-back"));
                    } catch (Exception excep) {       
                    }
            }
        });
         lblTriceps.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/10/muscle/triceps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        lblTraps1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try { Desktop.getDesktop().browse(
                                    new URI("http://www.bodybuilding.com/exercises/finder/lookup/filter/muscle/id/11/muscle/traps"));
                    } catch (Exception excep) {       
                    }
            }
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHelp1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblMain = new javax.swing.JLabel();
        lblGlutes = new javax.swing.JLabel();
        lblMidBack = new javax.swing.JLabel();
        lblLats = new javax.swing.JLabel();
        lblLowerBack = new javax.swing.JLabel();
        lblHamstrings = new javax.swing.JLabel();
        lblTraps1 = new javax.swing.JLabel();
        lblTriceps = new javax.swing.JLabel();
        lblQuads1 = new javax.swing.JLabel();
        lblCalves1 = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();
        lblForearm = new javax.swing.JLabel();
        lblQuads = new javax.swing.JLabel();
        lblShoulders = new javax.swing.JLabel();
        lblTraps = new javax.swing.JLabel();
        lblBiceps = new javax.swing.JLabel();
        lblNeck = new javax.swing.JLabel();
        lblCalves = new javax.swing.JLabel();
        lblChest = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lblClose = new javax.swing.JLabel();
        lblMinimi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallerlogo.png"))); // NOI18N
        jLabel1.setText(" ");

        btnHelp1.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        btnHelp1.setText("Help (?)");
        btnHelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelp1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jButton2.setText("Return to Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Heiti SC", 0, 24)); // NOI18N
        jLabel3.setText("Exercises Library");

        jButton1.setFont(new java.awt.Font("Heiti SC", 0, 12)); // NOI18N
        jButton1.setText("About - Golden Era Fitness");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exerc.png"))); // NOI18N

        lblGlutes.setText("gltes");
        lblGlutes.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblMidBack.setText("midbk");
        lblMidBack.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblLats.setText("lats");
        lblLats.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblLowerBack.setText("lowbk");
        lblLowerBack.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblHamstrings.setText("hm");
        lblHamstrings.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblTraps1.setText("Traps");
        lblTraps1.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblTriceps.setText("triceps");
        lblTriceps.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblQuads1.setText("quds");
        lblQuads1.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblCalves1.setText("Calves");
        lblCalves1.setToolTipText("View Exercises on the Official Bodybuilding website");

        lblAbs.setText("Abs");
        lblAbs.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblForearm.setText("Forearm");
        lblForearm.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblQuads.setText("Quads");
        lblQuads.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblShoulders.setText("Shoulders");
        lblShoulders.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblTraps.setText("Traps");
        lblTraps.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblBiceps.setText("Biceps");
        lblBiceps.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblNeck.setText("Neck");
        lblNeck.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblCalves.setText("Calves");
        lblCalves.setToolTipText("View exercises from the Official Bodybuilding website!");

        lblChest.setText("Chest");
        lblChest.setToolTipText("View exercises from the Official Bodybuilding website!");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblChest, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalves, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuads, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTraps, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNeck))
                        .addComponent(lblShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGlutes, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLowerBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLats, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTriceps, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTraps1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHamstrings, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalves1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblQuads1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMidBack, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblTraps1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTriceps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMidBack)
                        .addGap(12, 12, 12)
                        .addComponent(lblLowerBack, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGlutes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuads1)
                        .addGap(12, 12, 12)
                        .addComponent(lblHamstrings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCalves1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblNeck)
                        .addGap(8, 8, 8)
                        .addComponent(lblTraps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblShoulders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChest)
                        .addGap(9, 9, 9)
                        .addComponent(lblBiceps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblForearm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQuads)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCalves, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(lblMain, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblGlutes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblMidBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblLats, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblLowerBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblHamstrings, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTraps1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTriceps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblQuads1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCalves1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblAbs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblForearm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblQuads, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblShoulders, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblTraps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblBiceps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblNeck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblCalves, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblChest, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblClose.setText(" ");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMinimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimiMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/longbar.png"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(1207, Short.MAX_VALUE)
                .addComponent(lblMinimi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMinimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jLayeredPane2.setLayer(lblClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblMinimi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(314, 314, 314)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHelp1)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(btnHelp1))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        About x = new About();
        x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main x = new Main();
        x.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnHelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelp1ActionPerformed
        Help x = new Help();
        x.setVisible(true);
    }//GEN-LAST:event_btnHelp1ActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimiMouseClicked
        this.setState(Main_Staff.ICONIFIED);
    }//GEN-LAST:event_lblMinimiMouseClicked

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercises_LibraryPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblBiceps;
    private javax.swing.JLabel lblCalves;
    private javax.swing.JLabel lblCalves1;
    private javax.swing.JLabel lblChest;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblForearm;
    private javax.swing.JLabel lblGlutes;
    private javax.swing.JLabel lblHamstrings;
    private javax.swing.JLabel lblLats;
    private javax.swing.JLabel lblLowerBack;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblMidBack;
    private javax.swing.JLabel lblMinimi;
    private javax.swing.JLabel lblNeck;
    private javax.swing.JLabel lblQuads;
    private javax.swing.JLabel lblQuads1;
    private javax.swing.JLabel lblShoulders;
    private javax.swing.JLabel lblTraps;
    private javax.swing.JLabel lblTraps1;
    private javax.swing.JLabel lblTriceps;
    // End of variables declaration//GEN-END:variables
 
}
