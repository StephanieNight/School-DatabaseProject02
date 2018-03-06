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
public class DataFacade implements IData{
    private ISQLCom SQLCom;
    public DataFacade(ISQLCom sqlCommunications)
    {
        this.SQLCom = sqlCommunications;
    }
    public IDataResult[] getCouch() {
       return SQLCom.getCouch();
    }
    public IDataResult[] getPeople() {   
        return SQLCom.getPeople();
    }
    public IDataResult[] getTeams() {
           return SQLCom.getTeams();
    }
    public IDataResult[] getTournaments() {
         return SQLCom.getTournaments();  
    }    
}
