/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;

/**
 *
 * @author Markb
 */
class Team {
    
    private String name, country;
    private Person player, coach;
    private ArrayList<Person> players;

    public Team(String name, String country, Person coach, ArrayList<Person> players) {
        this.name = name;
        this.country = country;
        this.coach = coach;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person getCoach() {
        return coach;
    }

    public void setCoach(Person coach) {
        this.coach = coach;
    }

    public ArrayList<Person> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Person> players) {
        this.players = players;
    }

    
}
