package votingsystem;

import votingsystem.model.Storage;
import votingsystem.model.Candidate;

public class VotingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Storage.addCandidate(new Candidate("Trump Donald",Candidate.candType.President,0));
        Storage.addCandidate(new Candidate("Kasey Cuyos",Candidate.candType.Mayor,0));
        Storage.addCandidate(new Candidate("Renz Suck",Candidate.candType.Vice_President,0));
        Storage.addCandidate(new Candidate("Dan Help",Candidate.candType.District_Representative,0));
        int candSize = Storage.getCandList().size();
        for (int i = 0; i < candSize; i++){
            System.out.println(Storage.getCandidate(i).getFullName());
        }
    }   
}