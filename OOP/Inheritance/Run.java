public class Run {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.speak();
        System.out.println(dog.isAlive);
        System.out.println(dog.life);

        cat.speak();
        System.out.println(cat.isAlive);
        System.out.println(cat.life);

        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}