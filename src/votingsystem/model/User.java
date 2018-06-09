package votingsystem.model;

import java.util.UUID;

public class User {
    private String userId;
    private String name;
    private String pass;
    private int age;
    
    User(){
        this.userId = UUID.randomUUID().toString();
        this.name = null;
        this.pass = null;
    }
    
    User(String name, String pass){
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.pass = pass;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public void setAge(int age){
        this.age = age;
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
    
}