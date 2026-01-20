
public class Method {

    // method = a block of reusable code that is executed when called.

    static String name = "Peps";
    static int age = 21;

    public static void main(String[] args) {
        try {
            HappyBirthday(name, age);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    static void HappyBirthday(String name, int age/* argument */) {
        System.out.printf("Happy Birthday to you! %s!\n", name);
        System.out.printf("you are %s years old!", age);
    }
}