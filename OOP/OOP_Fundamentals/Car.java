public class Car {
    String car = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.50;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Starting Car");
    }
    void stop() {
        isRunning = false;
        System.out.println("Stopping Car");
    }

    void drive() {
        System.out.printf("Driving %s Car\n", model);
    }

    void breakCar() {
        System.out.printf("Breaking %s Car\n", model);
    }
}
