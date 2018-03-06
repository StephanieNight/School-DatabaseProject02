/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aq;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Markb
 */
public interface ITournament {
    
    String getName();
    Date getDate();
    int getPrize();
    ITeam getWinner();
    ArrayList<ITeam> getParticipants();
}
