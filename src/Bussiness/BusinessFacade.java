/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import Aq.IBusiness;
import Aq.IData;
import Aq.IPerson;
import Aq.ITeam;
import Aq.ITournament;
import java.util.ArrayList;

/**
 *
 * @author Markb
 */
public class BusinessFacade implements IBusiness{

    private IData dataFacade;

    @Override
    public void injectData(IData dataLayer) {
        this.dataFacade = dataLayer;
    }
    
    ArrayList<IPerson> people;
    ArrayList<ITeam> teams;
    ArrayList<ITournament> tournaments;

    @Override
    public ArrayList<IPerson> getPeople() {
        return people;
    }

    @Override
    public ArrayList<ITeam> getTeams() {
        return teams;
    }

    @Override
    public ArrayList<ITournament> getTournaments() {
        return tournaments;
    }
    
}
