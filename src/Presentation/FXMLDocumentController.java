/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

/**
 *
 * @author Markb
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableColumn<?, ?> peopleName;
    @FXML
    private TableColumn<?, ?> peopleNick;
    @FXML
    private TableColumn<?, ?> peopleMail;
    @FXML
    private TableColumn<?, ?> peopleTeam;
    @FXML
    private TableColumn<?, ?> teamName;
    @FXML
    private TableColumn<?, ?> teamCountry;
    @FXML
    private TableColumn<?, ?> teamCoach;
    @FXML
    private TableColumn<?, ?> teamPlayers;
    @FXML
    private TableColumn<?, ?> tourName;
    @FXML
    private TableColumn<?, ?> tourDate;
    @FXML
    private TableColumn<?, ?> tourPrize;
    @FXML
    private TableColumn<?, ?> tourWinner;
    @FXML
    private TableColumn<?, ?> cCoach;
    @FXML
    private TableColumn<?, ?> cTeam;
    @FXML
    private TableColumn<?, ?> winPerson;
    @FXML
    private TableColumn<?, ?> winTeam;
    @FXML
    private TableColumn<?, ?> winAmount;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
}
