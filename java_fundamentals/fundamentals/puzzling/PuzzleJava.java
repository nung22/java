// You will need to import the Random library from java.util
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    Random randMachine = new Random();
    
    // METHODS
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            tenRolls.add(randMachine.nextInt(20) + 1);
        }
        return tenRolls;
    }

    public String getRandomLetter() {
        ArrayList<String> alphabet = new ArrayList<String>(
            Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
        return alphabet.get(randMachine.nextInt(26));
    }

    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password.toLowerCase();
    }

    public ArrayList<String> getNewPasswordSet(int numPasswords) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < numPasswords; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
