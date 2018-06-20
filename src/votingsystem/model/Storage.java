package votingsystem.model;
import java.util.ArrayList;

public class Storage {
    private static ArrayList<User> personsUser = new ArrayList();
    //private static ArrayList<Candidate> candidate = new ArrayList();
    
    private static ArrayList<Candidate> presidents = new ArrayList();
    private static ArrayList<Candidate> vice_presidents = new ArrayList();
    private static ArrayList<Candidate> senators = new ArrayList();
    private static ArrayList<Candidate> district_representatives = new ArrayList();
    private static ArrayList<Candidate> governors = new ArrayList();
    private static ArrayList<Candidate> mayors = new ArrayList();
    
    private static boolean editable = true; 
    
    //EDITABLE FLAG METHODS-----------------------------------------------------
    public static boolean editable(){//return true/fals
        return editable;
    }
    
    public static void uneditable(){//sets to false
        editable = false;
    }
    
    //ADDING TO LISTS-----------------------------------------------------------
    public static void addUser(User p){
        Storage.personsUser.add(p); 
    }
    
    public static void addCandidate(Candidate o){
        switch(o.getCandType()){
            case "President": 
                presidents.add(o);
                break;
            case "Vice_President": 
                vice_presidents.add(o);
                break;
            case "Senator": 
                senators.add(o);
                break;
            case "District_Representative": 
                district_representatives.add(o);
                break;
            case "Governor": 
                governors.add(o);
                break;
            case "Mayor": 
                mayors.add(o);
        }
        //Storage.candidate.add(o);
    }
    
    //GETTERS-------------------------------------------------------------------
    public static ArrayList getUserList(){
        return Storage.personsUser;
    }
        
    public static int getUserNdx(User u){
        return Storage.personsUser.indexOf(u);
    }
    public static User getUser(int ndx){
        return Storage.personsUser.get(ndx);
    }
    
    public static int getCandNdx(Candidate u){
        switch(u.getCandType()){
            case "President": 
                return Storage.presidents.indexOf(u);
            case "Vice_President": 
                return Storage.vice_presidents.indexOf(u);
            case "Senator": 
                return Storage.senators.indexOf(u);
            case "District_Representative": 
                return Storage.district_representatives.indexOf(u);
            case "Governor": 
                return Storage.governors.indexOf(u);
            case "Mayor": 
                return Storage.mayors.indexOf(u);
            default:
                return 0;
        }
    }
    
    public static Candidate getCandidate(int ndx, String type){
       switch(type){
            case "President": 
                return Storage.presidents.get(ndx);
            case "Vice_President": 
                return Storage.vice_presidents.get(ndx);
            case "Senator": 
                return Storage.senators.get(ndx);
            case "District_Representative": 
                return Storage.district_representatives.get(ndx);
            case "Governor": 
                return Storage.governors.get(ndx);
            case "Mayor": 
                return Storage.mayors.get(ndx);
            default:
                return new Candidate("Error",Candidate.candType.Error,0);
        }
    }
    
    //REMOVING FROM LISTS-------------------------------------------------------
    public static void removeUser(User u){
        Storage.personsUser.remove(u);
    }
    
    public static void removeCandidate(Candidate u){
        switch(u.getCandType()){
            case "President": 
                Storage.presidents.remove(u);
                break;
            case "Vice_President": 
                Storage.vice_presidents.remove(u);
                break;
            case "Senator": 
                Storage.senators.remove(u);
                break;
            case "District_Representative": 
                Storage.district_representatives.remove(u);
                break;
            case "Governor": 
                Storage.governors.remove(u);
                break;
            case "Mayor": 
                Storage.mayors.remove(u);
        }
    }

}
