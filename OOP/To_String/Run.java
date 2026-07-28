public class Run {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object
        //               By default, it returns a hashcode as a unique identifier.
        //               It can be Overriden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 2025, "Red" );


        System.out.println(car);
    }
}