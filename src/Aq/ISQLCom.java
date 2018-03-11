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
    /**
     * Assigment A
     * @return 
     */
    public IDataResult getCoachAndTeam();
      /**
     * Assigment B
     * @return 
     */
    public IDataResult getPeopleWhoWon();
      /**
     * Assigment C
     * @return 
     */
    public IDataResult getTeamsAndPlayerCount();
    /**
     * Assignment D plus extra data 
     * @param n
     * @return 
     */
    public IDataResult getTournamentsWithTeams(int Participating);
    public IDataResult getWinners();
    public IDataResult getPeople();
}
