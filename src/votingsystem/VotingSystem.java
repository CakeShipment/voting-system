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
        Storage store = new Storage();
        store.addCandidate(new Candidate("Trump","Donald","President",0));
        System.out.println(store.getCandList().get(0).getFullName());
    }   
}