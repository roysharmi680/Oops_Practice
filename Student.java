class Student {

    // Attributes
    String name;
    int age;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Assigning values to attributes
        s1.name = "Rahul";
        s1.age = 20;

        // Calling method
        s1.displayDetails();
    }
}