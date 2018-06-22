package votingsystem.model;

import java.util.ArrayList;

public class Voters_Storage {
    //Hmmmm should we include on getting an individual candidate per List in Vsenator and Vreps?
    //i dont think we need this anymore. i never used it. i used a single Arraylist in the Storage - Dan
    private ArrayList<Candidate> vSenator = new ArrayList();
    private ArrayList<Candidate> vReps = new ArrayList();
    private Candidate vPresident;
    private Candidate vMayor;
    private Candidate vGovernor;
    private Candidate vVpres;
    
    public void addVSenator(Candidate p){
        this.vSenator.add(p);
    }
    
    public void addVReps(Candidate p){
        this.vReps.add(p);
    }
    
    public void setPres(Candidate p){
        this.vPresident = p;
    }
    
    public void setMayor(Candidate p){
        this.vMayor = p;
    }
    
    public void setVPres(Candidate p){
        this.vVpres = p;
    }
    
    public void setVGovernor(Candidate p){
        this.vGovernor = p;
    }
    
    public ArrayList getVSenatorList(){
        return this.vSenator;
    }
    
    public ArrayList getVReps(){
        return this.vReps;
    }
    
    public void delVReps(Candidate p){
        this.vReps.remove(p);
    }
    
    public void delVSenator(Candidate p){
        this.vSenator.remove(p);
    }
    
    
}
