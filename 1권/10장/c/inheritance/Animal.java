package c.inheritance;

public class Animal {
    String name;
    String kind;
    int legCount;
    int iq;
    boolean hasWing;

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.move();
        cat.move();
        dog.eatFood();
    }

    public void move() {
        System.out.println("move");
    }
    public void eatFood() {
        System.out.println("eat");
    }
}
