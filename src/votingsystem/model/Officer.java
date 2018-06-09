package votingsystem.model;
import votingsystem.model.Storage.*;

public class Officer extends User{

    public static final String USERTYPE = "officer";
    
    //CONSTRUCTORS--------------------------------------------------------------
    public Officer() {
        super();
    }
    
    public Officer(String name) {
        super(name);
    }
    
    public Officer(String name, String pass) {
        super(name, pass);
    }
    
    public Officer(String name, String pass, int age) {
        super(name, pass, age);
    }
    
    //CLASS METHODS-------------------------------------------------------------
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