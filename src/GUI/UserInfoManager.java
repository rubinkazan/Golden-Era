/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author rubinkazan
 */
public class UserInfoManager {
    
    private static UserInfoManager userInfoManager = new UserInfoManager();
    
    private int id = 0;
    private String name = "";
    private String surname = "";
    
    private UserInfoManager(){}

    public static UserInfoManager getInstance() {
        return userInfoManager;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String username) {
        this.name = username;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
}
