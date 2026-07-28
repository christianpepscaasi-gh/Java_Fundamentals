public class Run {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.car);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.year);
        System.out.println(car.isRunning);

        car.start();
        car.stop();
        car.drive();
        car.breakCar();
    }
}