package Ex7;

public class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("A new bird has been created!");
    }

    public void sleep() {
        System.out.println("A birds sleeps...");
    }

    public void eat() {
        System.out.println("A bird eats");
    }
}