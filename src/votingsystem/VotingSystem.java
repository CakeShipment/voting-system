package votingsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import votingsystem.model.Storage;
import votingsystem.model.Candidate;
import votingsystem.model.Superuser;
import votingsystem.model.Officer;
import votingsystem.model.Voter;
import votingsystem.form.Login_UI;

public class VotingSystem {

    public static void main(String[] args) throws ParseException {
        //ADDING CANDIDATES-----------------------------------------------------
        Storage.addCandidate(new Candidate("Barack Obama",Candidate.candType.President,0));
        Storage.addCandidate(new Candidate("Joe Biden",Candidate.candType.Vice_President,0));
        Storage.addCandidate(new Candidate("Mungo Pavel",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Hillary Clinton",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Mike Gravel",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("John Edwards",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Bill Richardson",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Tom Vilsak",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Cake Boi",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Antwan Ciela",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Dennis Kucinich",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Lord Gaben",Candidate.candType.Mayor,0));
        Storage.addCandidate(new Candidate("Aamir Bazza",Candidate.candType.Mayor,0));

        Storage.addCandidate(new Candidate("John McCain",Candidate.candType.President,0));
        Storage.addCandidate(new Candidate("Srah Palin",Candidate.candType.Vice_President,0));
        Storage.addCandidate(new Candidate("Fred Thompson",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Sam Brownback",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Tuomas Angelina",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Helena Macario",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Mike Huckabee",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Mitt Romney",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Duncan Hunter",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Megumi Bakır",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Lara Deepak",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Sjoerd Tshering",Candidate.candType.Mayor,0));
        Storage.addCandidate(new Candidate("Rudy Riuliani",Candidate.candType.Mayor,0));

        Storage.addCandidate(new Candidate("Columbanus Anton",Candidate.candType.President,0));
        Storage.addCandidate(new Candidate("Aldwin Momoko",Candidate.candType.Vice_President,0));
        Storage.addCandidate(new Candidate("Tolga Stace",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Angelina Nadiye",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Aina Toal",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Peder Epiphany",Candidate.candType.Senator,0));
        Storage.addCandidate(new Candidate("Coleman Anil",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Lazar Antonia",Candidate.candType.Governor,0));
        Storage.addCandidate(new Candidate("Ingrid Domingo",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Oana Iknur",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Wilburn Ji-Yeong",Candidate.candType.District_Representative,0));
        Storage.addCandidate(new Candidate("Alfher Donata",Candidate.candType.Mayor,0));
        Storage.addCandidate(new Candidate("Félix Vlado",Candidate.candType.Mayor,0));
        //ADDING USERS----------------------------------------------------------
        Storage.addUser(new Superuser("Superuser1", "pass1", 40, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Officer("Officer1", "pass2", 25, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Officer("Officer2", "pass3", 30,new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Voter("Voter1", "pass4", 18, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Voter("Voter2", "pass5", 60, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Voter("Voter3", "pass6", 24, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        Storage.addUser(new Voter("Voter4", "voter4", 34, new SimpleDateFormat("yyyy/MM/dd").parse("1987/02/01")));
        
//        int candSize = Storage.getCandList().size();
//        for (int i = 0; i < candSize; i++){
//            System.out.println(Storage.getCandidate(i).getFullName());
//        }
        
        Login_UI login = new Login_UI();
        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }   
}