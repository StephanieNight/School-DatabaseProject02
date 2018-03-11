/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aq.IDataResult;
import Aq.ISQLCom;
import Aq.IDataFacade;

/**
 *
 * @author Markb
 */
public class DataFacade implements IDataFacade {
    private ISQLCom SQLCom;
    public DataFacade(ISQLCom sqlCommunications) {
        this.SQLCom = sqlCommunications;
    }
    public DataFacade() {
        SQLCom = new PostgreSQLCom();
    }
    @Override
    public IDataResult getCoachAndTeam() {
        return SQLCom.getCoachAndTeam();

    }
    @Override
    public IDataResult getPeople() {
        return SQLCom.getPeople();

    }
    @Override
    public IDataResult getTeamsAndPlayerCount() {
        return SQLCom.getTeamsAndPlayerCount();
    }
    @Override
    public IDataResult getTournamentsWithTeams(int wins) {
        return SQLCom.getTournamentsWithTeams(wins);
    }
    @Override
    public IDataResult getPeopleWhoWon() {
       return  SQLCom.getPeopleWhoWon();
    }

    
}
