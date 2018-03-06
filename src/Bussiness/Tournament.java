/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Markb
 */
public class Tournament {
    
    private String name;
    private Date date;
    private Team team, winner;
    private int prize;
    private ArrayList<Team> participants;

    public Tournament(String name, Date date, Team winner, int prize, ArrayList<Team> participants) {
        this.name = name;
        this.date = date;
        this.winner = winner;
        this.prize = prize;
        this.participants = participants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public ArrayList<Team> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Team> participants) {
        this.participants = participants;
    }
    
    
    
    
    
}
