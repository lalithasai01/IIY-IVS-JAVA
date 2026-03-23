interface Vehicle {
    void start();
}

interface Electric {
    void charge();
}

class ElectricCar implements Vehicle, Electric {

    public void start() {
        System.out.println("Vehicle starts.");
    }

    public void charge() {
        System.out.println("Electric car needs charging.");
    }

    void drive() {
        System.out.println("Car can be driven.");
    }

    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();

        ec.start();
        ec.drive();
        ec.charge();
    }
}
