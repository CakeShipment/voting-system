/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem.model;

/**
 *
 * @author staff
 */
public class Candidate {
    private String Lname;
    private String Fname;
    private String candType;
    private int voteNo;
    
    public Candidate(String lname,String fname, String type, int vote){
        this.Lname = lname;
        this.Fname = fname;
        this.candType = type;
        this.voteNo = vote;
    }
    
    public String getFullName(){
        String fullName = "";
        fullName = this.Fname +" "+ this.Lname;
        return fullName;
    }
}
