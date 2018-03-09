/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Aq.IData;
import Data.DataFacade;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Markb
 */
public class FXMLController implements Initializable {

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
    @FXML
    private Tab peopleTab;
    @FXML
    private Tab teamsTab;
    @FXML
    private Tab tournamentsTab;
    @FXML
    private Tab coachesTab;
    @FXML
    private Tab winnersTab;
    @FXML
    private TabPane tabPane;
    
    
    
    private IData data = new DataFacade();
    @FXML
    private TextField numberField;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(data.getCoach());
    }    

    @FXML
    private void OnSelectTab(Event event) {
        Set s;
        int currentTab = tabPane.getSelectionModel().getSelectedIndex();
        
        switch(currentTab){
            case 0:
                data.getPeople().getData();
                
                break;
            case 1:
                data.getTeams().getData().toArray();
                
                break;
            case 2:
                s = data.getTournaments().getData();
                
                break;
            case 3:
                s = data.getCoach().getData();
                
                break;
            case 4:
                s = data.getWinners().getData();
                
                break;
                
                
        }
                
                
    }

    @FXML
    private void getBtnClicked(ActionEvent event) {
    }
    
}
