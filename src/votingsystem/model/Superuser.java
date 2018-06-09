package votingsystem.model;
import votingsystem.model.Storage.*;

public class Superuser extends User{
    
    public static final String USERTYPE = "superuser";
    
    public void addUser(User p){
        Storage.addUserList(p);
    }
    
    public void removeUser(User p){
        Storage.removeUser(p);
    }
        
    public void updateUser(String name, String pass, User p ){
        Storage.getUser(Storage.getUserNdx(p)).setName(name);
        Storage.getUser(Storage.getUserNdx(p)).setPass(pass);
    }
    
}