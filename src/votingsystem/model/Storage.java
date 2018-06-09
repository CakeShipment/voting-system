/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem.model;

import java.util.ArrayList;

/**
 *
 * @author staff
 */
public class Storage {
    private ArrayList<User> personsUser = new ArrayList();
    private ArrayList<Candidate> candidate = new ArrayList();
    
    public ArrayList getUserList(){
        return this.personsUser;
    }
    
    public ArrayList getCandList(){
        return this.candidate;
    }
    
    public void addUserList(User p){
        this.personsUser.add(p);
    }
    
    public void addCandidate(Candidate o){
        this.candidate.add(o);
    }
}
