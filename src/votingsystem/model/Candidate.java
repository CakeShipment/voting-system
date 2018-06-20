package votingsystem.model;

public class Candidate {
    private String fullName;
    private candType pos;
    private int voteNo = 0;
    
    public Candidate(String name, candType type, int vote){
        this.fullName = name;
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
        switch(this.pos){
            case President:
                return "President";
            case Vice_President:
                return "Vice_President";
            case Senator:
                return "Senator";
            case District_Representative:
                return "District_Representative";
            case Governor:
                return "Governor";
            case Mayor:
                return "Mayor";
            default:
                return "Error";
        }
    }
    
    public enum candType{
        President,Vice_President,Senator,District_Representative,Governor,Mayor,Error
    }
    
    public void setVote(int vote){
        this.voteNo += vote;
    }
    
    public void setName(String name){
        this.fullName = name;
    }
}
