package votingsystem;

import votingsystem.model.Storage;
import votingsystem.model.Candidate;
import votingsystem.model.Superuser;
import votingsystem.model.Officer;
import votingsystem.model.Voter;

public class VotingSystem {

    public static void main(String[] args) {
        //ADDING CANDIDATES-----------------------------------------------------
        Storage.addCandidate(new Candidate("Drump Tuterte",Candidate.candType.President,0));
        Storage.addCandidate(new Candidate("Kasey Cuyos",Candidate.candType.Mayor,0));
        Storage.addCandidate(new Candidate("Renz Suck",Candidate.candType.Vice_President,0));
        Storage.addCandidate(new Candidate("Dan Help",Candidate.candType.District_Representative,0));
        
        //ADDING USERS----------------------------------------------------------
        Storage.addUser(new Superuser("Superuser1", "pass1", 40));
        Storage.addUser(new Officer("Officer1", "pass2", 25));
        Storage.addUser(new Officer("Officer2", "pass3", 30));
        Storage.addUser(new Voter("Voter1", "pass4", 18));
        Storage.addUser(new Voter("Voter2", "pass5", 60));
        Storage.addUser(new Voter("Voter3", "pass6", 24));
        Storage.addUser(new Voter("Voter4"));
        
        int candSize = Storage.getCandList().size();
        for (int i = 0; i < candSize; i++){
            System.out.println(Storage.getCandidate(i).getFullName());
        }
    }   
}