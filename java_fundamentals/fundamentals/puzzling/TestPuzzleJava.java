import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
        // Instance of PuzzleJava class
        PuzzleJava generator = new PuzzleJava();
        
        //! ============ App Test Cases =============

        System.out.println("\n----- Ten Rolls Test -----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        
        System.out.println("\n----- Random Letter Test -----");
        for(int i = 0; i < 10; i++) {
            String randomLetter = generator.getRandomLetter();
            System.out.print(randomLetter);
            if (i < 9) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }

        System.out.println("\n----- Generate Password Test -----");
        String password = generator.generatePassword();
        System.out.println(password);

        System.out.println("\n----- New Password Set Test -----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(3);
        System.out.println(passwordSet);

        // System.out.println("\n----- Shuffle Array Test -----");
    }
}
