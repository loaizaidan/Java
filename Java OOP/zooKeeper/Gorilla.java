public class Gorilla extends Mammal{
    public Gorilla(){
        super();
    }

    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("The Gorilla has thrown something!");
    }

    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("The Gorilla is satisfied!");
    }

    public void climb(){
        this.energyLevel -=10;
        System.out.println("The Gorilla has climbed a tree!");
    }
}
