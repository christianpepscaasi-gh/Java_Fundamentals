public class Run {
    public static void main(String[] args) {

//        They help to protect object data and add rules for accessing or modifying
//        Getters = Method that make fields Readable
//        Setters = Method that make fields Writeable

        Car car = new Car("Mustang", "Red", 10000);

        car.setColor("Blue");
        car.setPrice(-1);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}