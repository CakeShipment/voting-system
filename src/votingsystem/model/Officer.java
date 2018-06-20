package votingsystem.model;
import java.util.Date;
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
    
    public Officer(String name, String pass, int age, Date dob) {
        super(name, pass, age, dob);
    }
    
    //CLASS METHODS-------------------------------------------------------------
    public void AddCandidate(Candidate o){
        Storage.addCandidate(o);
    }
    
    public void RemoveCandidate(Candidate o){
        Storage.removeCandidate(o);
    }
    
    public Boolean UpdateCandidate(String name,int vote, Candidate p){
        if(p.getVote() <= 0){
            Storage.getCandidate(Storage.getCandNdx(p)).setName(name);
            Storage.getCandidate(Storage.getCandNdx(p)).setVote(vote);
            return true;
        }else{
            return false;
        }
    }
}