public class Run {
    public static void main(String[] args) {
//        Polymorphism = "POLY" = "MANY"
//                       "MORPH" = "SHAPE"
//                       Objects can identify other objects,
//                       Objects can be treated as objects of a common superclass

        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car, boat, bike};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}