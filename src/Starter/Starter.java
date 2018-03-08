/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import Aq.IData;
import Aq.IGUI;
import Data.DataFacade;
import Presentation.UI;
import Aq.ISQLCom;
import Data.PostgreSQLCom;

/**
 *
 * @author Markb
 */
public class Starter {

    public static void main(String[] args) {
        //ISQLCom sql = new PostgreSQLCom();
        
        
        IData data = new DataFacade();
        IGUI ui = new UI();
        ui.injectData(data);     
        
        
        System.out.println("Ready to launch system");
        ui.startApplication(args);
        
    }
    
}
