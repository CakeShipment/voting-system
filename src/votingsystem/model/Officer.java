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
public class Officer extends User{
    public void AddCandidate(Candidate o){
        Storage.addCandidate(o);
    }
    
    public void RemoveCandidate(Candidate o){
        Storage.removeCandidate(o);
    }
    
    public void UpdateCandidate(String name,int vote, Candidate p){
        Storage.getCandidate(Storage.getCandNdx(p)).setName(name);
        Storage.getCandidate(Storage.getCandNdx(p)).setVote(vote);
    }
}