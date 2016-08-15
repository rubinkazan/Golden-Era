/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class StatGraph {
    
    public static void squatGraph(){
         try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE,SQUAT FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Squat Chart", "Date", "Squat", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(750,400);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
    public static void benchGraph(){
        try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE,[BENCH PRESS] FROM STATS";
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("BenchPress Graph", "Date", "Bench Press", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(750,400);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
     public static void deadLiftGraph(){
        try{
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            Connection connection = connectionManager.getConnection();
                    
            String query = "SELECT DATE, DEADLIFT FROM STATS WHERE ID"; //WHERE ID == CURRENT LOGGED IN USER
            JDBCCategoryDataset dataset = new JDBCCategoryDataset(connection, query);
            JFreeChart chart = ChartFactory.createLineChart("Dead Lift Graph", "Date", "Dead Lift", dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Progress Log", chart);
            frame.setVisible(true);
            frame.setSize(750,400);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
     
     public static void weightGainLoss(){
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
            frame.setSize(750,400);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
    
}
