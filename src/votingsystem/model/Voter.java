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
    
    public String vote (Candidate pres, Candidate vpres, Candidate mayor, Candidate gover, ArrayList<Candidate> repList, ArrayList<Candidate> senList,Candidate sen1, Candidate sen2, Candidate sen3, Candidate sen4, Candidate sen5, Candidate rep1, Candidate rep2, Candidate rep3, Candidate rep4){
        if(pres != null && vpres != null && mayor != null && gover != null && repList.size() == 5 && senList.size() == 5 ){
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
            return "Success";
        }else{
            return "Please Comply the Required Voter's Choice for Each position of the Candidates";
        }
 //Just Remove the parameters if u guys want to have a list instead of 1 by 1 also the codes below
//        vList.addVReps(rep1);
//        vList.addVReps(rep2);
//        vList.addVReps(rep3);
//        vList.addVReps(rep4);
//        vList.addVSenator(sen1);
//        vList.addVSenator(sen2);
//        vList.addVSenator(sen3);
//        vList.addVSenator(sen4);
//        vList.addVSenator(sen5);
//        vList.setMayor(mayor);
//        vList.setPres(pres);
//        vList.setVPres(vpres);
//        vList.setVGovernor(gover);
    }
    
}