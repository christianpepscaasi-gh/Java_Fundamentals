public class Main {
    public static void main(String[] args) {
        // Anounymous Class = a class that doesnt havea name. Cannot be reused
        // add custom behaviour having to create a new class
        // often used for one time use(TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak() {
                System.out.println("The dog speak *HI!*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}