
package GUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.*;
import java.text.DecimalFormat;
import org.jfree.ui.RefineryUtilities;


public class Graph extends ApplicationFrame{

   
    public static void main( String[ ] args )throws Exception
   {
      String mobilebrands[] = {
      "IPhone 5s",   
      "SamSung Grand",   
      "MotoG",            
      "Nokia Lumia" 
      };
      
      /* Create MySQL Database Connection */
      Class.forName( "com.mysql.jdbc.Driver" );
      Connection connect = DriverManager.getConnection( 
      "jdbc:mysql://localhost:3306/jf_testdb" ,     
      "root",     
      "root123");
      
      Statement statement = connect.createStatement( );
      ResultSet resultSet = statement.executeQuery("select * from dataset_tb" );
      DefaultPieDataset dataset = new DefaultPieDataset( );
      while( resultSet.next( ) ) 
      {
         dataset.setValue( 
         resultSet.getString( "brandname" ) ,
         Double.parseDouble( resultSet.getString( "datavalue" )));
      }
      JFreeChart chart = ChartFactory.createPieChart(
         "Mobile Sales",  // chart title           
         dataset,         // data           
         true,            // include legend          
         true,           
         false );

      int width = 560; /* Width of the image */
      int height = 370; /* Height of the image */ 
      File pieChart = new File( "Pie_Chart.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}
    

