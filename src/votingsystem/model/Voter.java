package votingsystem.model;
import java.util.ArrayList;
import java.util.Date;

public class Voter extends User{
    public Voters_Storage vList = new Voters_Storage();
    //CONSTRUCTORS--------------------------------------------------------------
    public Voter() {
        super();
    }
    
    public Voter(String name) {
        super(name);
    }
    
    public Voter(String name, String pass) {
        super(name, pass);
    }
    
    public Voter(String name, String pass, int age) {
        super(name, pass, age);
    }
    
    public Voter(String name, String pass, int age, Date dob) {
        super(name, pass, age, dob);
    }
    
    //CLASS METHODS-------------------------------------------------------------
    private boolean isLegalAge (){
        return (Integer.parseInt(Storage.getUser(Storage.getUserNdx(this)).getAge()) >= 18);
    }
    
    public Boolean vote (Candidate pres, Candidate vpres, Candidate mayor, Candidate gover, ArrayList<Candidate> repList, ArrayList<Candidate> senList){
        if(pres != null && vpres != null && mayor != null && gover != null && repList.size() <= 5 && senList.size() <= 5 ){
            Storage.getCandidate(Storage.getCandNdx(pres)).setVote(1);
            Storage.getCandidate(Storage.getCandNdx(vpres)).setVote(1);
            Storage.getCandidate(Storage.getCandNdx(mayor)).setVote(1);
            Storage.getCandidate(Storage.getCandNdx(gover)).setVote(1);

            for(int x = 0; x < repList.size(); x++){
                repList.get(x).setVote(1);
                vList.addVReps(repList.get(x));
            }
            for(int y = 0; y < senList.size(); y++){
                senList.get(y).setVote(1);
                vList.addVSenator(senList.get(y));
            }
            return true;
        }else{
            return false;
        }
    }
    
}
