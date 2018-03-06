/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Aq.IDataResult;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Stephanie
 */
public class SQLDataResult implements IDataResult{
    private Set<String> result;
    public SQLDataResult()
    {
        result = new HashSet<>();
    }
    public void addData(String dataline)
    {
        result.add(dataline);        
    }
    @Override
    public Set getData() 
    {
        return result;
    }    
}
