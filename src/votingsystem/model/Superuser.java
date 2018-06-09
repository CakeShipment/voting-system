/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem.model;
import votingsystem.model.Storage.*;
/**
 *
 * @author staff
 */
public class Superuser extends User{
    public void addUser(User p){
        Storage.addUserList(p);
    }
    
    public void removeUser(User p){
        Storage.removeUser(p);
    }
        
    public void updateUser(String name, String pass, User p ){
        Storage.getUser(Storage.getUserNdx(p)).setName(name);
        Storage.getUser(Storage.getUserNdx(p)).setPass(pass);
    }
    
}