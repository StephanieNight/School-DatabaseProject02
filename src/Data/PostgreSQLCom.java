/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aq.IDataResult;
import Aq.ISQLCom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TreeSet;

/**
 *
 * @author Stephanie
 */
public class PostgreSQLCom implements ISQLCom {

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

    @Override
    public IDataResult getCoach() {
        IDataResult r = new SQLDataResult();
        try {
            String statement = "SELECT People.Name AS Coach, Teams.Name AS Team\n"
                    + "FROM People, Teams\n"
                    + "WHERE People.Email = Teams.Coach";
            
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);
            PreparedStatement p = db.prepareStatement(statement);
            ResultSet rs = p.executeQuery();
            
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
                r.getData().add(rs.getString(1));
                r.getData().add(rs.getString(2));
            }
            db.close();
            rs.close();
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }

    @Override
    public IDataResult getPeople() {
        IDataResult r = new SQLDataResult();
        try {
            String statement = "";
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

    @Override
    public IDataResult getTeams() {
        IDataResult r = new SQLDataResult();
        try {
            String statement = "";
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
        return null;
    }

    @Override
    public IDataResult getTournaments() {
        IDataResult r = new SQLDataResult();
        try {
            String statement = "";
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

    @Override
    public IDataResult getWinners() {
        IDataResult r = new SQLDataResult();
        try {
            String statement = "";
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
