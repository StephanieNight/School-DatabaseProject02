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
    private DummyData dummy = new DummyData();

    public DataFacade(ISQLCom sqlCommunications) {
        this.SQLCom = sqlCommunications;
    }

    public DataFacade() {
        SQLCom = new PostgreSQLCom();
    }

    public IDataResult getCoach() {
        IDataResult r = SQLCom.getCoach();
        if (r.getData().isEmpty()) {
            dummy.loadDummyData();
            r = SQLCom.getCoach();
        }
        return r;
    }

    public IDataResult getPeople() {
        IDataResult r = SQLCom.getPeople();
        if (r.getData().isEmpty()) {
            dummy.loadDummyData();
            r = SQLCom.getPeople();
        }
        return r;
    }

    public IDataResult getTeams() {
        IDataResult r = SQLCom.getTeams();
        if (r.getData().isEmpty()) {
            dummy.loadDummyData();
            r = SQLCom.getTeams();
        }
        return r;
    }

    public IDataResult getTournaments() {
        IDataResult r = SQLCom.getTournaments();
        if (r.getData().isEmpty()) {
            dummy.loadDummyData();
            r = SQLCom.getTournaments();
        }
        return r;
    }

    @Override
    public IDataResult getWinners() {
        IDataResult r = SQLCom.getWinners();
        if (r.getData().isEmpty()) {
            dummy.loadDummyData();
            r = SQLCom.getWinners();
        }
        return r;
    }
}
