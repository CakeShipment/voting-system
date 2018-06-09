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
    private String fullName;
    private String candType;
    private int voteNo;
    
    public Candidate(String name, String type, int vote){
        this.fullName = name;
        // President - Vice President - Senator - District Representative - Governor - Mayor 
        this.candType = type;
        this.voteNo = vote;
    }
    
    public String getFullName(){
        return this.fullName;
    }
}
