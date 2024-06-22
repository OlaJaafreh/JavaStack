
public class Phone extends Device{
	
	public void makeCall() {
        battery -= 5;
        System.out.println("You make a call");
        butteryLife();
    }
	
	public void playGame() {
		if (battery < 25) {
            System.out.println("you cant play because battery below " + battery);
        } else {
		battery -= 20;
		 System.out.println("You play a game.");
        butteryLife();
        }
    }
	
	public void charge() {
		battery += 50;
		System.out.println("You charge the phone.");
        butteryLife();
    }
	
//	public void  butteryLife() {
//		if (battery < 10) {
//            System.out.println("Battery critical: " + battery);
//        } 
//	}
	
	
}
