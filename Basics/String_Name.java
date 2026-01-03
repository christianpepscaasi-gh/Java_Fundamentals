public class String_Name {
    public static void main(String[] args) {
        String name = "Christian Peps Caasi";

        int length = name.length();// take the length of the name
        char letter = name.charAt(0);// find the letter of the given number
        int index = name.indexOf(" ");// find a letter in given index
        int lastindex = name.lastIndexOf("e");// find a letter in given index

        // name = name.toLowerCase();//make it all in lowercase;
        // name = name.toUpperCase();//make it all in uppercase;
        // name = name.trim();//trim all space
        // name = name.replace("i", "a");//replace the letter i to a

        System.out.println(length);

        // System.out.println(name.isEmpty());//this line check in boolean method if the
        // name is empty or not
        // ANOTHER EXAMPLE:
        /*
         * if(name.isEmpty()){
         * System.out.print("Your name is Empty.");
         * } else {
         * System.out.print(name);
         * }
         */

        // CONTAINMENT
        /*
         * if (name.contains(" ")) {
         * System.out.println("Your name contains spaces");
         * } else {
         * System.out.println("Your name doesnt contain any spaces");
         * }
         */

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name cannot be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
