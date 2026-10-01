class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Main {
    public static void main(String[] args) {

        Car c = new Car("Toyota", 180, 4);

        c.displayCar();
    }
}