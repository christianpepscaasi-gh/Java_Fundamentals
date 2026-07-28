public class Run{
    public static void main(String[] args){

//        Interface = A blueprint for a class that specifies a set of abstract methods
//                    that implements classes MUST define
//                    Supports multiple inheritance like behaviour


        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        //Fish inherit both
        fish.flee();
        fish.hunt();
    }
}