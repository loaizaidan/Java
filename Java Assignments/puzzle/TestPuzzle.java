import java.util.ArrayList;
import java.util.Random;
public class TestPuzzle {
    

    //Test Cases: 
    public static void main(String[] args) {
        Puzzle generator = new Puzzle();

        System.out.println("All test cases:");

        System.out.println("\nThis is the getTenRolls test:");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("\nThis is the getRandomLetter test:");
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random letter: " + randomLetter);

        System.out.println("\nThis is the generatePassword test:");
        String generatePassword = generator.generatePassword();
        System.out.println("Generated Password: " + generatePassword);

        System.out.println("\nThis is the getNewPasswordSet test:");
        ArrayList<String> newPassword = generator.getNewPasswordSet(4);
        System.out.println("New Generated Password: " + newPassword);
    }
}