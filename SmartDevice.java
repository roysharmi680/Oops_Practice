interface SmartDevice1 {
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice1 {

    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}

class Light implements SmartDevice1 {

    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}

class AC implements SmartDevice1 {

    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}

public class SmartDevice {
    public static void main(String[] args) {

        SmartDevice1 device1 = new Fan();
        SmartDevice1 device2 = new Light();
        SmartDevice1 device3 = new AC();

        device1.turnOn();
        device2.turnOn();
        device3.turnOn();

        device1.turnOff();
        device2.turnOff();
        device3.turnOff();
    }
}