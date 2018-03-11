/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author Stephanie
 */
public class Coach {
    private String name;
    private String team;

    public Coach(String name, String team) {
        this.name = name;
        this.team = team;
    }
    // get the name
    public String getCoach() {
        return name;
    }

    public String getTeam() {
        return team;
    }
    
    
}
