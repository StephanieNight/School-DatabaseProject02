/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aq.IData;
import Aq.IDataResult;
import Aq.ISQLCom;

/**
 *
 * @author Markb
 */
public class DataFacade implements IData {

    private ISQLCom SQLCom;

    public DataFacade(ISQLCom sqlCommunications) {
        this.SQLCom = sqlCommunications;
    }

    public DataFacade() {
        SQLCom = new PostgreSQLCom();
    }

    public IDataResult getCoach() {
        System.out.println("DF getCoach");
        IDataResult r = SQLCom.getCoach();
        
        return r;
    }

    public IDataResult getPeople() {
        IDataResult r = SQLCom.getPeople();
        return r;
    }

    public IDataResult getTeams() {
        IDataResult r = SQLCom.getTeams();
        return r;
    }

    public IDataResult getTournaments() {
        IDataResult r = SQLCom.getTournaments();
        return r;
    }

    @Override
    public IDataResult getWinners() {
        IDataResult r = SQLCom.getWinners();
        return r;
    }

    
}
