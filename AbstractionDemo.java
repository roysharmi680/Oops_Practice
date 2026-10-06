abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    Car() {
        // Default constructor
    }

    void start() {
        System.out.println("Car started");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}