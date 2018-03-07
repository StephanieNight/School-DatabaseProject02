/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markb
 */
public class DummyData {

    File file = null;

    public void loadPeople() {

        String line;
        String[] tokens;
        file = new File("People.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0]);
                
                insertData("People", tokens[0] + ", " + tokens[1] + ", " + tokens[2]);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }

    }
    
        public void loadTeams() {

        String line;
        String[] tokens;
        file = new File("Teams.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0]);
                
                insertData("Teams", tokens[0] + ", " + tokens[1] + ", " + tokens[2]);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }

    }
        
        public void loadTournaments() {

        String line;
        String[] tokens;
        file = new File("Tournaments.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0]);
                
                insertData("Tournaments", tokens[0] + ", " + tokens[1] + ", " + tokens[2] + ", " + tokens[3]);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }

    }
        
        public void loadPlaysFor() {

        String line;
        String[] tokens;
        file = new File("PlaysFor.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0]);
                
                insertData("PlaysFor", tokens[0] + ", " + tokens[1]);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }

    }
        
        public void loadPlaysIn() {

        String line;
        String[] tokens;
        file = new File("PlaysIn.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0]);
                
                insertData("PlaysIn", tokens[0] + ", " + tokens[1] + ", " + tokens[2]);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }

    }
    
    public void insertData(String table, String str) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/vlnyuiox";
        String username = "vlnyuiox";
        String password = "I_hhy6YhTcdjh87QHyXvfXhY8Q_rr1yu";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            
            String query = "INSERT INTO" + table + "VALUES(" + str + ");";
            PreparedStatement p = db.prepareStatement(query);
            
            ResultSet rs = p.executeQuery();
            //rs.gets
            while (rs.next()) {

                System.out.print(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            rs.close();
            //st.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
