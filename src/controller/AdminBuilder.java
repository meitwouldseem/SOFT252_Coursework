/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Administrator;

/**
 *
 * @author Matthew
 */
public class AdminBuilder {
    private Integer userNum;
    private String firstName;
    private String surname;
    private String address;
    private String password;
    
    public void setUserNum(Integer num)
    {
        this.userNum = num;
    }
    
    public void setFirstName(String name)
    {
        this.firstName = name;
    }
    
    public void setSurname(String name)
    {
        this.surname = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public Administrator build()
    {
        return new Administrator(userNum, firstName, surname, address, password);
    }
}