/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem.model;

import java.util.UUID;

/**
 *
 * @author staff
 */
public class User {
    private String userId;
    private String name;
    private String pass;
    
    User(){
        this.userId = UUID.randomUUID().toString();
        this.name = null;
        this.pass = null;
    }
    
    User(String name, String pass){
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.pass = pass;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPass(){
        return this.pass;
    }
}