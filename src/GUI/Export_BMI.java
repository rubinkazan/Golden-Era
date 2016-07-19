
package GUI;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Export_BMI {
    
        public static double BMI_Calc(double weight, double height){
        height = height / 100;
        double bmi = (height * height) / weight;
        return bmi;
     
    }
        
    public void ExportPDF(){
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
            //Print the currently logged in user Name/Surname/Gender/DOB and BMI
            //y.println()
            //y.println(bmi);
                      
        }catch (Exception f){
            f.printStackTrace();
        }
    }
    

    
    
}
