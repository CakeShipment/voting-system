package votingsystem.model;
import votingsystem.model.Storage.*;

public class Voter extends User{
    
    public static final String USERTYPE = "voter";
    
    private boolean isLegalAge (){
        return (Integer.parseInt(Storage.getUser(Storage.getUserNdx(this)).getAge()) >= 18);
    }
    
    public void vote (){
        
    }
    
}