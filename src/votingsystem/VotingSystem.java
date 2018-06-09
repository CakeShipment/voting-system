/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import votingsystem.model.Storage;
import votingsystem.model.Candidate;

/**
 *
 * @author staff
 */
public class VotingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Storage.addCandidate(new Candidate("Trump Donald","President",0));
        Storage.addCandidate(new Candidate("Kasey Cuyos","Mayor",0));
        Storage.addCandidate(new Candidate("Renz Suck","Vice President",0));
        Storage.addCandidate(new Candidate("Dan Help","District Representative",0));
        int candSize = Storage.getCandList().size();
        for (int i = 0; i < candSize; i++){
            System.out.println(Storage.getCandidate(i).getFullName());
        }
    }   
}