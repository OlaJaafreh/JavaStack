import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    

    public ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> tenRolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tenRolls.add(randMachine.nextInt(20));
        }
        return tenRolls;
    }


    public char getRandomLetter(){
        char[] letters = new char[26];
        Random randLetter = new Random();

        for (int i = 0; i < 26; i++) {
            letters[i]=(char)('A'+ i);
        }
        // System.out.println(randomLetter[randLetter]);
        return letters[randLetter.nextInt(26)];
    }


    public char[] getLetter(){
        char[] letters = new char[26];

        for (int i = 0; i < 26; i++) {
            letters[i]=(char)('A'+ i);
        }
        // System.out.println(randomLetter[randLetter]);
        return letters;
    }


    // public char[] generatePassword(){

    //     char[] letters = new char[26];
    //     Random randLetter = new Random();
    //     char[] pass = new char[8];

    //     for (int i = 0; i < 26; i++) {
    //         letters[i]=(char)('A'+ i);
    //     }

    //     for (int i = 0; i < 8; i++) {
    //         pass[i]=letters[randLetter.nextInt(26)];
    //     }
    //     // System.out.println(randomLetter[randLetter]);
    //     return pass;
    // }

    public String generatePassword(){

        char[] letters = getLetter();
        Random randLetter = new Random();
        StringBuilder pass = new StringBuilder(8);
        

        for (int i = 0; i < 8; i++) {
            pass.append(letters[randLetter.nextInt(26)]);
        }
        // System.out.println(randomLetter[randLetter]);
        return pass.toString();
    }


    public String[] getNewPasswordSet(int passwordsNum){

        // String pass = generatePassword();
        String[] passwords = new String[passwordsNum];
        
        

        for (int i = 0; i < passwordsNum; i++) {
            passwords[i]=generatePassword();
        }
        // System.out.println(randomLetter[randLetter]);
        return passwords;
    }



//     public String[] shuffleArray(String[] passwordsNum){

    
    
// }
