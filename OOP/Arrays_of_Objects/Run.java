public class Run{
    public static void main(String[] args){
//        Car car1 = new Car ("Honda", "Grey");
//        Car car2 = new Car ("Suzuki", "Red");
//        Car car3 = new Car ("Ford", "Orange");
//        Car[] cars = {car1, car2, car3};

        Car[] cars = {
                new Car("Honda", "Grey"),
                new Car("Suzuki", "Black"),
                new Car("Honda", "Blue")
        };

        for(Car car : cars){
            car.drive();
        }
    }
}