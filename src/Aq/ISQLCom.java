/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aq;

/**
 * @author Stephanie
 */
public interface ISQLCom {
    public static final char SPLIT_CHAR ='/';
    public IDataResult getCouch();
    public IDataResult getPeople();
    public IDataResult getTeams();
    public IDataResult getTournaments();
}
