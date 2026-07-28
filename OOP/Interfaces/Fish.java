public class Fish implements Prey, Predator{

    @Override
    public void hunt(){
        System.out.println("*Fish hunts small fishes*");
    }

    @Override
    public void flee(){
        System.out.println("*Fish swims away*");
    }
}