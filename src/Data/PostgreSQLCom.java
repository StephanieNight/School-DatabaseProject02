/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aq.ISQLCom;
import Aq.IDataResult;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Stephanie
 */
public class PostgreSQLCom implements ISQLCom{

    private final String sqlConnectionString;
    private final String username;
    private final String password;

    public PostgreSQLCom() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }
        this.sqlConnectionString = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/exvsnrqs";
        this.username = "exvsnrqs";
        this.password = "ufuOcmXNXh82kTeFS1bbglbe4-uau7dW";
    }
    /**
     * Assingment A
     * @return 
     */
    public IDataResult getCoach() {
        IDataResult r = new SQLDataResult();
        try {
            String statement =  "SELECT People.Name AS Coach, Teams.Name AS Team\n" +
                                "FROM People, Teams\n" +
                                "WHERE People.Email = Teams.Coach";
            
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            
            while (rs.next()) {
              //  System.out.print(rs.getString(1) + " ");
              //  System.out.println(rs.getString(2) + " ");
                r.addData(rs.getString(1),rs.getString(2));
            }
            db.close();
            rs.close();            
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /**
     * Assingment B
     * @return 
     */
    public IDataResult getPeople() {
        IDataResult r = new SQLDataResult();
        try {
            String statement =  "SELECT People.Name AS People, Teams.Name AS Team, COUNT(Teams.Name) AS Tournamentswon\n" +
                                "FROM People, Teams, Tournaments, PlaysFor\n" +
                                "WHERE Teams.Name = Tournaments.Winner AND PlaysFor.Team = Teams.Name AND People.Email " +
                                "IN (PlaysFor.Player, Teams.Coach)\n" +
                                "Group by Teams.Name, People\n" +
                                "Order by Team";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {
                r.addData(rs.getString(1),rs.getString(2),rs.getString(3));              
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /**
     * Assingment C
     * @return 
     */
    public IDataResult getTeams() {
        IDataResult r = new SQLDataResult();
        try {
            String statement =  "SELECT Team, COUNT(Player) \n" +
                                "FROM PlaysFor\n" +
                                "GROUP BY Team\n";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {
                r.addData(rs.getString(1),rs.getString(2));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    /**
     * Assingment D
     * @param number
     * @return 
     */
    public IDataResult getTournaments(int number) {
        IDataResult r = new SQLDataResult();
        try {
            
            String statement =  "SELECT Name, Date, Prize, Winner\n" +
                                "FROM Tournaments\n" +
                                "GROUP BY Name, Date, Prize, Winner\n" +
                                "HAVING Name IN (SELECT Tournamentname \n" +
                                "FROM PlaysIn \n" +
                                "Group BY tournamentname HAVING COUNT(PlaysIn.Team) >="+number+")";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                r.addData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    public IDataResult getWinners() {
        IDataResult r = new SQLDataResult();
        try {
            String statement =  "select * from team";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
                r.getData().add(rs.getString(1));
                r.getData().add(rs.getString(2));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }


}
