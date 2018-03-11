/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aq;

/**
 *
 * @author Markb
 */
public interface IPeople {
    
    public String getName();
    public String getNickname();
    public String getEmail();
    public String getTeam();
    public void setName(String name);
    public void setNickname(String nickname) ;
    public void setEmail(String Email);
    public void setTeam(String Team);
}
