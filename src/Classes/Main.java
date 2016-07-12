package Classes;


public class Main {


public class PasswordValidation {
    
    public String PasswordValidation(){
    String password = "";
    String password2 = "";
    String output = "";
    if(password.isEmpty() && password2.isEmpty()){
        
        
        
    }
    
}
    
    
     public static String Checkpassword(String pword) {
        String output = "";
        String password = pword.replaceAll(" ", "");//removes all spaces
        if (password.length() > 5) {//must be at least 6 characters
            if (!makeint(makeint(password)).equalsIgnoreCase("0")) {//if removing all letters from the string leave it blank, then it must have been all letters, and so it returns an appropriate message after flagging thepassword
                if (!(makeint(password).length() == password.length())) {// if the length of a string representing all the numbers in a string is equal to the length of the string, then logically, all the characters in the string must be letters, this if statement checks to make sure that there is at least one character that is not a number
                    return output;
                } else {
                    output = "your password must contain at least one letter";
                    return output;
                }
            } else {
                output = "your password must contain at least one number";
                return output;
            }
        } else {
            output = "your password is too short";
            return output;
        }
    }
    
}

    
}
