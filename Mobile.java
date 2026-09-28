class Mobile {

    String brand;
    String model;
    int price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Using Default Constructor
        Mobile m1 = new Mobile();

        // Using Parameterized Constructor
        Mobile m2 = new Mobile("Samsung", "Galaxy S24", 75000);

        m1.display();
        m2.display();
    }
}