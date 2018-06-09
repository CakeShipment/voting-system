package votingsystem.model;
import votingsystem.model.Storage.*;

public class Voter extends User{
    
    public static final String USERTYPE = "voter";
    
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
    
    //CLASS METHODS-------------------------------------------------------------
    private boolean isLegalAge (){
        return (Integer.parseInt(Storage.getUser(Storage.getUserNdx(this)).getAge()) >= 18);
    }
    
    public void vote (){
        
    }
    
}