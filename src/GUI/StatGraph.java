/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;


public class StatGraph {
    
    public static void squatGraph(){
         try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DOB,SQUAT FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Test Chart", "Date", "Squat", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Test Chart", chart);
            frame.setVisible(true);
            frame.setSize(650,800);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
    public void benchGraph(){
        try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE,BENCH PRESS FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Bench Press Graph", "Date", "Bench Press", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(650,800);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
     public void deadLiftGraph(){
        try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE, DEADLIFT FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Dead Lift Graph", "Date", "Dead Lift", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(650,800);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
     
     public void weightGainLoss(){
        try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE, WEIGHT FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Weight Gain/Loss Graph", "Date", "Weight", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(650,800);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
    
}
