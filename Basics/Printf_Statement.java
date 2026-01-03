public class Printf_Statement {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // %[flag][width][.precision][specifier-character]

        String name = "ChristianPepsCaasi";// if using a string, you need lowercase s
        char firstLetter = 'C';// if using a character, you need lowercase c
        int age = 21;// // if using a integer, you need lowercase d
        double height = 60.5;// if using a double, you need lowercase f
        boolean isStudent = true;// if using a boolean, you need lowercase b

        System.out.printf("Hello %s", name);
        System.out.printf("Your name start with a %c", firstLetter);
        System.out.printf("You are %d years old", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("You are %b\n", isStudent);

        System.out.printf("%s is %d years old", name, age);

        // PRECISION TYPE
        double price1 = 20.2;
        double price2 = 12.99;
        double price3 = 12.12331;
        double price4 = -12.42;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.1f\n", price3);// .[number of decimal you want]f

        // FLAGS
        // + = output a plus
        // , = coma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("% .2f\n", price3);
        System.out.printf("%(.2f\n", price4);

        // WIDTH
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 4161;
        int id3 = 12;
        int id4 = 231;

        // SPACE
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        // 0 PADDING
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        // LEFT PADDING
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }

}
