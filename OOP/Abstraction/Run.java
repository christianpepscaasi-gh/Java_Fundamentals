public class Run{
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential feature
        //            Abstract class CANT be instantiate directly
        //            CAN contain abstract methods
        //            CAN contain concrete methods

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 5);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}