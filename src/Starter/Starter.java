/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import Aq.IData;
import Aq.IGUI;
import Bussiness.BusinessFacade;
import Data.DataFacade;
import Presentation.UI;
import Aq.IBusiness;
import Aq.ISQLCom;
import Data.PrograteSQLCom;

/**
 *
 * @author Markb
 */
public class Starter {

    public static void main(String[] args) {
        ISQLCom sql = new PrograteSQLCom();
        IData data = new DataFacade(sql);
        IBusiness business = new BusinessFacade();
        business.injectData(data);
        IGUI ui = new UI();
        ui.injectBusiness(business);       
        
        System.out.println("Ready to launch system");
        ui.startApplication(args);
        
    }
    
}
