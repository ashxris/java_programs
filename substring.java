import java.util.Scanner;

public class substring {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));

        System.out.println(username);
        System.out.println(domain);

        scanner.close();

    }
}
