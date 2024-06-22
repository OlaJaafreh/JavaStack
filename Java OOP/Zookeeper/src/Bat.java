
public class Bat extends Mammal{
	
	public Bat() {
        this.energy = 300;
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("The bat is airborne.");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("the bat's satisfaction");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("bat's attack");
    }

}
