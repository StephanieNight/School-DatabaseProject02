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
public class Tournamet {
    private String name; 
    private String date; 
    private String price; 
    private String winner;

    public Tournamet(String name, String date, String price, String winner) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.winner = winner;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPrize() {
        return price;
    }

    public String getWinner() {
        return winner;
    }    
}
