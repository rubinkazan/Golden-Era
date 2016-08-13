/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;


public class GraphSkeleton extends JFrame {
    public GraphSkeleton(){
        super("Test");
        
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
        
        setSize(640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    private JPanel createChartPanel(){
        
    }
    
    private XYDataset createDataset(){
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        
        
    }
    
     public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(new Runnable() {
                            UserInfoManager userInfoManager
                            = UserInfoManager.getInstance();
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
            
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT" + userInfoManager.getId() + "FROM PTMEMBERS");
            //@Override
            public void run() {
                new GraphSkeleton().setVisible(true);
            }
        });
     }
    
    
}
