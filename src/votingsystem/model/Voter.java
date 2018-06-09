package votingsystem.model;
import votingsystem.model.Storage.*;

public class Voter extends User{
        
    public void updateUser(String name, String pass, User p, int age){
        Storage.getUser(Storage.getUserNdx(p)).setName(name);
        Storage.getUser(Storage.getUserNdx(p)).setPass(pass);
        Storage.getUser(Storage.getUserNdx(p)).setAge(age);
    }
    
    private boolean legalAge (){
        return true;
    }
    
    public void vote (){
        
    }
    
}