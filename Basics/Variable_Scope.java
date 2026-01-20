public class Variable_Scope {

    static int x = 3;// CLASS

    public static void main(String[] args) {
        // Variable Scope = where a variable can be access
        int x = 1;// LOCAL

        System.out.println(x);
        do_Something();
    }

    static void do_Something() {
        int x = 2; // LOCAL
        System.out.println(x);
    }
}
// Java always look at the local first before the class scope