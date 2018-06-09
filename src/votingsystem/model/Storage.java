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
    private static ArrayList<User> personsUser = new ArrayList();
    private static ArrayList<Candidate> candidate = new ArrayList();
    
    public static ArrayList getUserList(){
        return Storage.personsUser;
    }
    
    public static ArrayList getCandList(){
        return Storage.candidate;
    }
    
    public static void addUserList(User p){
        Storage.personsUser.add(p);
    }
    
    public static void addCandidate(Candidate o){
        Storage.candidate.add(o);
    }
    
    public static void removeUser(User u){
        Storage.personsUser.remove(u);
    }
    
    public static void removeCandidate(Candidate u){
        Storage.candidate.remove(u);
    }
    
    public static int getUserNdx(User u){
        return Storage.personsUser.indexOf(u);
    }
    public static User getUser(int ndx){
        return Storage.personsUser.get(ndx);
    }
    
    public static int getCandNdx(Candidate u){
        return Storage.candidate.indexOf(u);
    }
    
    public static Candidate getCandidate(int ndx){
        return Storage.candidate.get(ndx);
    }
    
}
