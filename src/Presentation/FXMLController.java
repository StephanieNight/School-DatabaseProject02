/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.DataFacade;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import Aq.IDataFacade;
import Aq.IDataResult;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author Markb
 */
public class FXMLController implements Initializable {

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
    
    private IDataFacade data = new DataFacade();
    @FXML
    private TextField numberField;
    @FXML
    private TableView<Person> Tb_People;
    @FXML
    private TableView<Teams> Tb_Teams;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {   

        TableColumn nameCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        TableColumn nickNameCol = new TableColumn("NickName");
        nickNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("nickName")); 
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        TableColumn TeamCol = new TableColumn("Team");
        TeamCol.setCellValueFactory(new PropertyValueFactory<Person, String>("team"));        
        TableColumn coantryCol = new TableColumn("Country");
        nickNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("country")); 
        TableColumn coachCol = new TableColumn("Coach");
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("coach"));
        TableColumn playerCol = new TableColumn("Players");
        TeamCol.setCellValueFactory(new PropertyValueFactory<Person, String>("player"));
        TableColumn dateCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        TableColumn prizeCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        TableColumn winnerCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        TableColumn tournamentswonCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
      
        //----------------------------------------------------------------------
        // TB_people
        Tb_People.getItems().clear();
        Tb_People.getColumns().clear();
        Tb_People.getColumns().addAll(nameCol, nickNameCol, emailCol, TeamCol);
        //----------------------------------------------------------------------
        // TB_people
        Tb_Teams.getItems().clear();
        Tb_Teams.getColumns().clear();
        Tb_Teams.getColumns().addAll(nameCol, coantryCol, coachCol, playerCol);
        
        
        /** TableColumn dateCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        TableColumn dateCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        */
        
        Tb_People.getColumns().addAll(nameCol, nickNameCol, emailCol, TeamCol);
        //----------------------------------------------------------------------
        // TB_people
        //----------------------------------------------------------------------
        Tb_People.getItems().clear();
        Tb_People.getColumns().clear();
        Tb_People.getColumns().addAll(nameCol, nickNameCol, emailCol, TeamCol);
        
        
}    

    @FXML
    private void OnSelectTab(Event event) {  
        getData();                 
    }

    @FXML
    private void getBtnClicked(ActionEvent event) {
    }
    
    
    private void getData()
    {        
        IDataResult dr;
        int currentTab = tabPane.getSelectionModel().getSelectedIndex();  
        
        switch(currentTab){
            case 0:
                ObservableList<Person> PeopleData = FXCollections.observableArrayList();                  
                dr= data.getPeople();
                for(String dataString : dr.getData())
                {
                    String[] data = dataString.split(dr.SPLIT_String);
                    Person p = new Person(data[0],data[1],data[2],data[3]); 
                    //System.out.println(p.getNickname());
                    PeopleData.add(p);                    
                }
                Tb_People.setItems(PeopleData);                
                break;
            case 1:
                ObservableList<Teams> TeamsData = FXCollections.observableArrayList();
                dr= data.getTeams();
                for(String dataString : dr.getData())
                {
                    String[] data = dataString.split(dr.SPLIT_String);
                    Teams p = new Teams(data[0],data[1],data[2],data[3]); 
                    //System.out.println(p.getNickname());
                    TeamsData.add(p);                    
                }
                Tb_Teams.setItems(TeamsData);               
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
                
                
        }
    }
    
}
