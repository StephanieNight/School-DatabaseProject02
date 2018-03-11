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
    @Override
    public void addData(String data01)
    {         
        result.add(data01);        
    }
    @Override
    public void addData(String data01,String data02)
    {
        addData(data01+SPLIT_String+data02);
    }
    @Override
    public void addData(String data01,String data02,String data03)
    {
        addData(data01,data02+SPLIT_String+data03);
    }
    @Override
    public void addData(String data01,String data02,String data03,String data04)
    {
        addData(data01,data02,data03+SPLIT_String+data04);
    }
    @Override
    public void addData(String data01,String data02,String data03,String data04,String data05)
    {
        addData(data01,data02,data03,data04+SPLIT_String+data05);
    }
    @Override
    public Set<String> getData() 
    {
        return result;
    }    
}
