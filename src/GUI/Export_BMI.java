
package GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Export_BMI {
    
        public void BMI_Calc(double weight, double height){
        height = height / 100;
        double bmi = (height * height) / weight;
     
    }
        
    public static void Export(){
        //Fetch current logged in user from SQL database name and set it as file name
        //String name = SQL.....name;
        File filename = new File(name);
        
        try{
            PrintWriter x = new PrintWriter(new FileWriter(filename + ".pdf"));
            PrintWriter y;
            if(!filename.exists()){
                FileWriter fileWriter = new FileWriter(filename);
            }
            y = new PrintWriter(filename);
            y.println(BMI_Calc());
                      
        }catch (Exception f){
            f.printStackTrace();
        }
    }
    

    
    
}
