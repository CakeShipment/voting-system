package votingsystem.model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class User {
    
    private String userId;
    private String name;
    private String pass;
    private int age;
    private Date DOB;
    
    //CONSTRUCTOR CHAINING------------------------------------------------------
    User(){
        this.userId = UUID.randomUUID().toString();
        this.name = null;
        this.pass = null;
        this.age = 18;
        this.DOB = null;
    }
    
    User(String name){
        this();
        this.name = name;
        this.pass = "default";
    }
    
    User(String name, String pass){
        this(name);
        this.pass = pass;
    }
    
    User(String name, String pass, int age){
        this(name, pass);
        this.age = age;
    }

    User(String name, String pass, int age, Date bday){
        this(name, pass, age);
        this.DOB = bday;
    }
    
    //CLASS METHODS-------------------------------------------------------------
    public void setName(String name){
        this.name = name;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setDOB(Date bday){
        this.DOB = bday;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPass(){
        return this.pass;
    }
    
    public String getAge(){
        return Integer.toString(this.age);
    }

    public String getDOB(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(DOB);
    }
    public String getID(){
        return this.userId;
    }
}