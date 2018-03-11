/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aq;

import java.util.Set;

/**
 *
 * @author Stephanie
 */
public interface IDataResult {
    public static final String SPLIT_String ="\t";
    public Set<String> getData();
    public void addData(String dataline);
    public void addData(String data01,String data02);
    public void addData(String data01,String data02,String data03);
    public void addData(String data01,String data02,String data03,String data04);
    public void addData(String data01,String data02,String data03,String data04,String data05);
}
