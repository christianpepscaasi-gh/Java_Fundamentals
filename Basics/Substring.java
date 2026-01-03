import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // .stubstring() = A method used to extract a portion of a string
        // string.substring(start, end)

        String email;
        String username;
        String domain;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Email: ");
        email = scanner.nextLine();

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println(username);
        System.out.println(domain);

        scanner.close();
    }
}
