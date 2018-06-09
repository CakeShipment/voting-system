package votingsystem.model;
import votingsystem.model.Storage.*;

public class Officer extends User{

    public static final String USERTYPE = "officer";
    
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