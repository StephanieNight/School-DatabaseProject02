/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aq.ITeams;

/**
 *
 * @author Stephanie
 */
public class Teams implements ITeams{
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
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {return country; }

    @Override
    public String getCoach() {return coach; }

    @Override
    public String getPlayers() {return players;  }
    
}
