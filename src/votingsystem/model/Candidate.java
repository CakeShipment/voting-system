package votingsystem.model;

public class Candidate {
    private String fullName;
    private candType pos;
    private int voteNo = 0;
    
    public Candidate(String name, candType type, int vote){
        this.fullName = name;
        // President - Vice President - Senator - District Representative - Governor - Mayor 
        this.pos = type;
        this.voteNo = vote;
    } 
    
    public String getFullName(){
        return this.fullName;
    }
    
    public int getVote(){
        return this.voteNo;
    }
    
    public String getCandType (){
        String type = "Error";
        switch(this.pos){
            case President:
                type = "President";
                break;
            case Vice_President:
                type = "Vice_President";
                break;
            case Senator:
                type = "Senator";
                break;
            case District_Representative:
                type = "District_Representative";
                break;
            case Governor:
                type = "Governor";
                break;
            case Mayor:
                type = "Mayor";
                break;
        }
        return type;
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
