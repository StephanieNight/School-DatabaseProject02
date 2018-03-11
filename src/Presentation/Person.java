/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Stephanie
 */
public class Person  {
    private final String name;
    private final String nickName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty team; 
    public Person(String name, String nickName, String email,String team) {
        this.name = name;
        this.nickName = nickName;
        this.email = new SimpleStringProperty(email);
        this.team = new SimpleStringProperty(team);
    }
    // Must be same as column name !
    public String getName() {
        return this.name;
    }
    public String getNickName() {
        return nickName;
    }
    public String getEmail() {
        return this.email.get();
    }
    public String getTeam() {
        return this.team.get();
    }  
}