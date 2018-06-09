package votingsystem.model;

public class Candidate {
    private String fullName;
    private candType pos;
    private int voteNo;
    
    public Candidate(String name, candType type, int vote){
        this.fullName = name;
        // President - Vice President - Senator - District Representative - Governor - Mayor 
        this.pos = type;
        this.voteNo = vote;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    public enum candType{
        President,Vice_President,Senator,District_Representative,Governor,Mayor
    }
    
    public void setVote(int vote){
        this.voteNo += vote;
    }
    public void setName(String name){
        this.fullName = name;
    }
    
}
