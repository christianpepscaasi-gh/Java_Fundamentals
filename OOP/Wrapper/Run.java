public class Run {
    public static void main(String[] args){

//        Wrapper classes = Allow primative Values(int, char, double, boolean) to be use as Obj
//                "Wrap them in an Object" Generally, dont wrap primative values unless you
//                need an object. Allows use of collection Framework and static utility methods

//    //AutoBoxing

//    Integer a = 1;
//    Double b = 2.1;
//    Character c = '$';
//    Boolean d = true;
//
//    //Unboxing

//        int num1 = a;
//        double num2 = b;
//        char currency = c;
//        boolean flag = d;


//        Integer a = Integer.toString(123);
//        Double b = Double.toString(2.12);

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");

    char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
    }
}