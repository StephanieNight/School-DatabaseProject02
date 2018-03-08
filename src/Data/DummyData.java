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

    File file;
    String url = "jdbc:postgresql://dumbo.db.elephantsql.com:5432/exvsnrqs";
    String username = "exvsnrqs";
    String password = "ufuOcmXNXh82kTeFS1bbglbe4-uau7dW";

    public DummyData() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public void loadDummyData() {
        loadPeople();
        loadTeams();
        loadTournaments();
        loadPlaysFor();
        loadPlaysIn();
    }

    public void loadPeople() {

        String line;
        String[] tokens;
        file = new File("People.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                line = sc.nextLine();
                tokens = line.split("/");
                System.out.println(tokens[0] + tokens[1] + tokens[2]);

                insertData("People", "'" + tokens[0] + "', '" + tokens[1] + "', '" + tokens[2] + "'");

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
            Connection db = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO " + table + " VALUES(" + str + ");";
            Statement p = db.createStatement();

            int rs = p.executeUpdate(query);

            
            db.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
