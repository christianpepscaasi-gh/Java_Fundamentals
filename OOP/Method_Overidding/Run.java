public class Run{
    public static void main(String[] args) {
        //method overidding = When Subclasses provide its own implementation
        //                    of a method that is already defined.
        //                    allows the code reusability and give specific implementations.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}