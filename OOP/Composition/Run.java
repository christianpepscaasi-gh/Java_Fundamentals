public class Run{
    public static void main(String[] args){

//        Composition = Represent a "part-of" relationship between object
//                For example, an Engine is "Part-of" a car
//                Allows complex object to be constructed from smaller objects

        Car car = new Car("Mustang", 2025, "V-8 Engine");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}