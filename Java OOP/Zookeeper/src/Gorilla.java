
public class Gorilla extends Mammal{
	
	public Gorilla() {
        super();
    }

    public void throwSomething() {
        this.energy -= 5;
        System.out.println("The gorilla has thrown something.");
    }

    public void eatBananas() {
        this.energy += 10;
        System.out.println("gorilla's satisfaction");
    }

    public void climb() {
        this.energy -= 10;
        System.out.println("the gorilla has climbed a tree.");
    }
    

}
