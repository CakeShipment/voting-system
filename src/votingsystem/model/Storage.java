package votingsystem.model;
import java.util.ArrayList;

public class Storage {
    private static ArrayList<User> personsUser = new ArrayList();
    
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
    
    public static ArrayList<Candidate> getCandList(String type){
       switch(type){
            case "President": 
                return Storage.presidents;
            case "Vice_President": 
                return Storage.vice_presidents;
            case "Senator": 
                return Storage.senators;
            case "District_Representative": 
                return Storage.district_representatives;
            case "Governor": 
                return Storage.governors;
            case "Mayor": 
                return Storage.mayors;
            default:
                return null;
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
                Candidate temp = new Candidate("", stringToType(type),0);
                Storage.addCandidate(temp);
                return temp;
        }
    }
    
    private static Candidate.candType stringToType(String type){
        switch(type){
            case "President": 
                return Candidate.candType.President;
            case "Vice_President": 
                return Candidate.candType.Vice_President;
            case "Senator": 
                return Candidate.candType.Senator;
            case "District_Representative": 
                return Candidate.candType.District_Representative;
            case "Governor": 
                return Candidate.candType.Governor;
            default: 
                return Candidate.candType.Mayor;
        }
    }
    
    //REMOVING FROM LISTS-------------------------------------------------------
    public static void removeUser(User u){
        Storage.personsUser.remove(u);
    }
    
    public static void removeCandidate(Candidate u){
        switch(u.getCandType()){
            case "President": 
                Storage.presidents.remove(getCandNdx(u));
                break;
            case "Vice_President": 
                Storage.vice_presidents.remove(getCandNdx(u));
                break;
            case "Senator": 
                Storage.senators.remove(getCandNdx(u));
                break;
            case "District_Representative": 
                Storage.district_representatives.remove(getCandNdx(u));
                break;
            case "Governor": 
                Storage.governors.remove(getCandNdx(u));
                break;
            case "Mayor": 
                Storage.mayors.remove(getCandNdx(u));
        }
    }

}
