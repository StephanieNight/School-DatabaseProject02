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
public class Teams {
    private String name; 
    private String country;
    private String coach;
    private String players;

    public Teams(String name, String country, String coach, String Players) {
        this.name = name;
        this.country = country;
        this.coach = coach;
        this.players = Players;
    }    
    public String getName() {return name;}
    public String getCountry() {return country; }
    public String getCoach() {return coach; }
    public String getPlayers() {return players;}    
}
