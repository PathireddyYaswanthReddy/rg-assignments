interface Vehicle {

    void start(); // abstract method

    // default method
    default void fuelType() {
        System.out.println("Runs on Petrol or Diesel");
    }

    // static method
    static void maintenanceTip() {
        System.out.println("Check engine oil regularly.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    // Can override default method (optional)
    @Override
    public void fuelType() {
        System.out.println("Car runs on Petrol");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.fuelType();

        Vehicle.maintenanceTip();
    }
}
