abstract class Animal1 {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal1 {

    // Providing implementation of abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}