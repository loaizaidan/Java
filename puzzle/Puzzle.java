import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    /*
     * Dev Name: Loai Zaidan
     * Description: getTenRolls, creates and array list with 10 indexes, where each index is filled with a random number between 0 and 20.
     */
    public ArrayList<Integer> getTenRolls() {
        Random random = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(random.nextInt(20) + 1);
        }
        return rolls;
    }
    /*
     * Description: getRandomLetter, this function prints a random letter in a defined char array, that has the whole alphabet
     */
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        int randomIndex = random.nextInt(26);
        return alphabet[randomIndex];
    }
    /*
     * Description: generatePassword, this function generates a random password that contains 8 letters using the "alphabet" we initialized in getRandomLetter
     */
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }
    /*
     * Description: getNewPasswordSet, this function generates the same outcome as generatePassword, but puts them in an array list, with each password being 8 letters, and the number of passwords can be defined through the paramter "length"
     */
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}