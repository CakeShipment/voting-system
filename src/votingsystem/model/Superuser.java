package votingsystem.model;
import votingsystem.model.Storage.*;

public class Superuser extends User{
    
    public static final String USERTYPE = "superuser";
    
    //CONSTRUCTORS--------------------------------------------------------------
    public Superuser() {
        super();
    }
    
    public Superuser(String name) {
        super(name);
    }
    
    public Superuser(String name, String pass) {
        super(name, pass);
    }
    
    public Superuser(String name, String pass, int age) {
        super(name, pass, age);
    }
    
    //CLASS METHODS-------------------------------------------------------------
    public void addUser(User p){
        Storage.addUser(p);
    }
    
    public void removeUser(User p){
        Storage.removeUser(p);
    }
        
    public void updateUser(String name, String pass, User p ){
        Storage.getUser(Storage.getUserNdx(p)).setName(name);
        Storage.getUser(Storage.getUserNdx(p)).setPass(pass);
    }
    
}