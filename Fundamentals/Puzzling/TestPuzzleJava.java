import java.util.ArrayList;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();

		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String pass = generator.generatePassword();
        System.out.println(pass);

        String[] passwords = generator.getNewPasswordSet(5);
        // System.out.println(passwords);
        for (String password : passwords) {
            System.out.print(password + " ");
        }


        // for (char alpha : randomLetter) {
        //     System.out.print(alpha + " ");
        // }
        
		
    	        //..
		// Write your other test cases here.
		//..
	}
}