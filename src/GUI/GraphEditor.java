
package GUI;

import java.sql.*;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphEditor {
    private String table;
    private DefaultCategoryDataset dataset;

    private double total = 0;
    private double count = 0;

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    
    public GraphEditor(String table){
        this.table = table;
        
        try{
            Connection connection;
            
            ConnectionManager connectionManager = ConnectionManager.getInstance();
            connection = connectionManager.getConnection();

            preparedStatement = connection.prepareStatement("SELECT * FROM " + table
            + "ORDER BY date");
        }catch (SQLException sqlExcep){
            sqlExcep.printStackTrace();
            
        }catch (Exception excep){
            excep.printStackTrace();
            
        }         
    }
    
    public GraphItem createGraphItem(String chartTitle, String category, CatType categoryType,
                                     String xAxisLabel, String yAxisLabel){

        dataset = new DefaultCategoryDataset();

        total = 0;
        count = 0;

        try {

            resultSet = preparedStatement.executeQuery();

            switch (categoryType){
                case INT:
                    while (resultSet.next()){
                        addValue(resultSet.getInt(category), "Series1", resultSet.getDate("date"));
                    }
                    break;
                case DOUBLE:
                    while (resultSet.next()){
                        addValue(resultSet.getDouble(category), "Series1", resultSet.getDate("date"));
                    }
                    break;

            }

        }catch (SQLException sqlExcep){
            sqlExcep.printStackTrace();
        }catch (Exception excep){
            excep.printStackTrace();
        }

        GraphItem graphItem = new GraphItem(chartTitle, dataset, xAxisLabel, yAxisLabel);
        graphItem.setTotal(total);
        graphItem.setCount(count);
        graphItem.setCategoryType(categoryType);

        return graphItem;
    }

    public void updateGraphItem(GraphItem graphItem, String category, CatType categoryType){

        dataset = new DefaultCategoryDataset();

        total = 0;
        count = 0;

        try {

            resultSet = preparedStatement.executeQuery();

            switch (categoryType){
                case INT:
                    while (resultSet.next()){
                        addValue(resultSet.getInt(category), "Series1", (resultSet.getDate("date")));
                    }
                    break;
                case DOUBLE:
                    while (resultSet.next()){
                        addValue(resultSet.getDouble(category), "Series1", resultSet.getDate("date"));
                    }
                    break;

            }

        }catch (SQLException sqlExcep){
            sqlExcep.printStackTrace();
        }catch (Exception excep){
            excep.printStackTrace();
        }

        graphItem.update(dataset);


    }

    private void addValue(double value, Comparable rowKey, Comparable columnKey){
        dataset.addValue(value, rowKey, columnKey);
        total += value;
        count++;
    }
}
