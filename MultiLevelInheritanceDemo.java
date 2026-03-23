class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car can be driven.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car needs charging.");
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {

        ElectricCar ec = new ElectricCar();

        ec.start();    // From Vehicle
        ec.drive();    // From Car
        ec.charge();   // From ElectricCar
    }
}
