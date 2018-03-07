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

/**
 *
 * @author Stephanie
 */
public class PostgreSQLCom implements ISQLCom{
    private final String sqlConnectionString;
    private final String username;
    private final String password;
    public PostgreSQLCom()
    {
        this.sqlConnectionString = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/vlnyuiox";
        this.username = "vlnyuiox";
        this.password = "I_hhy6YhTcdjh87QHyXvfXhY8Q_rr1yu";
    }
    @Override
    public IDataResult getCoach() {
        try {
            String statement = "Select * from Team";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);            
            PreparedStatement p = db.prepareStatement(statement);            
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    @Override
    public IDataResult getPeople() {
       try {
            String statement = "";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);            
            PreparedStatement p = db.prepareStatement(statement);            
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    @Override
    public IDataResult getTeams() {  
           try {
            String statement = "";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);            
            PreparedStatement p = db.prepareStatement(statement);            
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;   
    }
    @Override
    public IDataResult getTournaments() {
       try {
            String statement = "";
            Connection db = DriverManager.getConnection(sqlConnectionString, username, password);            
            PreparedStatement p = db.prepareStatement(statement);            
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return null;        
    }

    @Override
    public IDataResult getWinners() {
        return null;
    }
    
}
