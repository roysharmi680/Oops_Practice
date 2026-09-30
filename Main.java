class Car {

    // Private attributes
    private String brand;
    private String color;
    private int speed;

    // Constructor
    Car(String b, String c, int s) {
        brand = b;
        color = c;
        speed = s;
    }

    // Public method
    public void accelerate(int increase) {
        speed = speed + increase;
    }

    // Public method
    public void brake(int decrease) {
        speed = speed - decrease;

        if (speed < 0) {
            speed = 0;
        }
    }

    // Public method
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object using constructor
        Car car = new Car("Toyota", "Red", 50);

        car.accelerate(30);
        car.brake(10);

        car.display();
    }
}