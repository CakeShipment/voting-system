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
    public static boolean editable = true; 
    
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
    
//    public static ArrayList getCandList(){ 
//        return Storage.candidate;
//    }
//    
//    public static int getCandNdx(Candidate u){
//        return Storage.candidate.indexOf(u);
//    }
//    
//    public static Candidate getCandidate(int ndx){
//        return Storage.candidate.get(ndx);
//    }
    
    //REMOVING FROM LISTS-------------------------------------------------------
    public static void removeUser(User u){
        Storage.personsUser.remove(u);
    }
    
    public static void removeCandidate(Candidate u){
        Storage.candidate.remove(u);
    }

}
