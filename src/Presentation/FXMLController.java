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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import Aq.IDataFacade;
import Aq.IDataResult;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ScrollEvent;
/**
 * FXML Controller class
 *
 * @author Markb
 */
public class FXMLController implements Initializable {

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
    private TableView<Person> Tb_People;
    @FXML
    private TableView<Teams> Tb_Teams;
    @FXML
    private TableView<Tournamet> tb_tournaments;
    @FXML
    private TableView<Coach> tb_coach;
    @FXML
    private TableView<Winners> tb_Winners;
    @FXML
    private Slider sWins;
    @FXML
    private Label lWins;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {   
        //----------------------------------------------------------------------
        // Label bind 
         //----------------------------------------------------------------------
        lWins.textProperty().bind(
            Bindings.format(
                "%.0f",
                sWins.valueProperty()
            )
        );

        //----------------------------------------------------------------------
        // intitalice form  
        tb_Winners.getItems().clear();
        tb_Winners.getColumns().clear();
        
        Tb_People.getItems().clear();
        Tb_People.getColumns().clear();
        
        Tb_Teams.getItems().clear();
        Tb_Teams.getColumns().clear();
        
        tb_coach.getItems().clear();
        tb_coach.getColumns().clear();
        
        tb_tournaments.getItems().clear();
        tb_tournaments.getColumns().clear();
    }    
    @FXML
    private void getBtnClicked(ActionEvent event) {
        getData();
    }
    
    
    private void getData()
    {
        int currentTab = tabPane.getSelectionModel().getSelectedIndex();
        switch(currentTab){
            case 0:
                addDatatoPeople();           
                break;
            case 1:
                addDatatoTeams();
                break;
            case 2:
                addDatatotournaments((int)sWins.getValue());
                break;
            case 3:
                addDatatoCoaches();
                break;
            case 4:
                addDatatowinners();
                break;                
        }
    }
    public void addDatatoPeople()
    {
        TableColumn nameCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        nameCol.setPrefWidth(100.0);
        TableColumn nickNameCol = new TableColumn("NickName");
        nickNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("nickName"));
        nickNameCol.setPrefWidth(100.0);
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        emailCol.setPrefWidth(200.0);
        TableColumn TeamCol = new TableColumn("Team");
        TeamCol.setCellValueFactory(new PropertyValueFactory<Person, String>("team"));   
        TeamCol.setPrefWidth(120.0);
        
        Tb_People.getItems().clear();
        Tb_People.getColumns().clear();
        Tb_People.getColumns().addAll(nameCol, nickNameCol, emailCol, TeamCol);
                
        IDataResult dr;
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
    }
    public void addDatatoTeams()
    {
        TableColumn nameCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        nameCol.setPrefWidth(120.0);
        TableColumn coantryCol = new TableColumn("Country");
        coantryCol.setCellValueFactory(new PropertyValueFactory<Person, String>("country")); 
        coantryCol.setPrefWidth(120.0);
        TableColumn coachCol = new TableColumn("Coach");
        coachCol.setCellValueFactory(new PropertyValueFactory<Person, String>("coach"));
        coachCol.setPrefWidth(200.0);
        TableColumn playerCol = new TableColumn("Players");
        playerCol.setCellValueFactory(new PropertyValueFactory<Person, String>("players"));
        playerCol.setPrefWidth(80.0);
        
        Tb_Teams.getItems().clear();
        Tb_Teams.getColumns().clear();
        Tb_Teams.getColumns().addAll(nameCol, coantryCol, coachCol, playerCol);
        
        IDataResult dr;
        ObservableList<Teams> TeamsData = FXCollections.observableArrayList();
        dr= data.getTeamsAndPlayerCount();
        for(String dataString : dr.getData())
        {
            String[] data = dataString.split(dr.SPLIT_String);
            Teams p = new Teams(data[0],data[1],data[2],data[3]); 
            //System.out.println(p.getNickname());
            TeamsData.add(p);                    
        }
        Tb_Teams.setItems(TeamsData);       
        
    } 
    public void addDatatotournaments(int numberOfWins)
    {     
        TableColumn nameCol = new TableColumn("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name")); 
        nameCol.setPrefWidth(160.0);
        TableColumn dateCol = new TableColumn("Date");
        dateCol.setCellValueFactory(new PropertyValueFactory<Person, String>("date")); 
        dateCol.setPrefWidth(120.0);
        TableColumn prizeCol = new TableColumn("Prize");
        prizeCol.setCellValueFactory(new PropertyValueFactory<Person, String>("prize"));
        prizeCol.setPrefWidth(120.0);
        TableColumn winnerCol = new TableColumn("Winner");
        winnerCol.setCellValueFactory(new PropertyValueFactory<Person, String>("winner")); 
        winnerCol.setPrefWidth(120.0);
     
        tb_tournaments.getItems().clear();
        tb_tournaments.getColumns().clear();
        tb_tournaments.getColumns().addAll(nameCol, dateCol, prizeCol, winnerCol);
        
        IDataResult dr;
        ObservableList<Tournamet> Data = FXCollections.observableArrayList();
        dr= data.getTournamentsWithTeams(numberOfWins);
        for(String dataString : dr.getData())
        {
            String[] data = dataString.split(dr.SPLIT_String);
            Tournamet p = new Tournamet(data[0],data[1],data[2],data[3]); 
            //System.out.println(p.getNickname());
            Data.add(p);                    
        }
        tb_tournaments.setItems(Data); 
        
    }
    public void addDatatoCoaches()
    {
        TableColumn coachCol = new TableColumn("Coach");
        coachCol.setCellValueFactory(new PropertyValueFactory<Person, String>("coach"));
        coachCol.setPrefWidth(300.0);
        TableColumn TeamCol = new TableColumn("Team");
        TeamCol.setCellValueFactory(new PropertyValueFactory<Person, String>("team"));   
        TeamCol.setPrefWidth(300.0);
                
        tb_coach.getItems().clear();
        tb_coach.getColumns().clear();
        tb_coach.getColumns().addAll(coachCol, TeamCol);
        
        IDataResult dr;
        ObservableList<Coach> Data = FXCollections.observableArrayList();
        dr= data.getCoachAndTeam();
        for(String dataString : dr.getData())
        {
            String[] data = dataString.split(dr.SPLIT_String);
            Coach d = new Coach(data[0],data[1]); 
            //System.out.println(p.getNickname());
            Data.add(d);                    
        }
        tb_coach.setItems(Data);         
    }  
    public void addDatatowinners()
    {
        TableColumn coachCol = new TableColumn("Name");
        coachCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        coachCol.setPrefWidth(200.0);
        TableColumn TeamCol = new TableColumn("Team");
        TeamCol.setCellValueFactory(new PropertyValueFactory<Person, String>("team")); 
        TeamCol.setPrefWidth(150.0);
        TableColumn tournamentswonCol = new TableColumn("Tournaments won");
        tournamentswonCol.setCellValueFactory(new PropertyValueFactory<Person, String>("wins"));
        tournamentswonCol.setPrefWidth(150);
        
        tb_Winners.getItems().clear();
        tb_Winners.getColumns().clear();
        tb_Winners.getColumns().addAll(coachCol, TeamCol,tournamentswonCol);
        
        IDataResult dr;
        ObservableList<Winners> Data = FXCollections.observableArrayList();
        dr= data.getPeopleWhoWon();
        for(String dataString : dr.getData())
        {
            String[] data = dataString.split(dr.SPLIT_String);
            Winners d = new Winners(data[0],data[1],data[2]); 
            //System.out.println(p.getNickname());
            Data.add(d);                    
        }
        tb_Winners.setItems(Data); 
    } 

    @FXML
    private void sliderRelease(ScrollEvent event) {
    }
}
