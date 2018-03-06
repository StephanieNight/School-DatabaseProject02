/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aq;

import java.util.ArrayList;

/**
 *
 * @author Markb
 */
public interface IBusiness {
    
    void injectData(IData dataLayer);
    ArrayList<IPerson> getPeople();
    ArrayList<ITeam> getTeams();
    ArrayList<ITournament> getTournaments();
    
    
    
}
