import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = reader.nextInt();
        reader.nextLine(); // Consume newline

        System.out.print("Enter your favorite decimal number: ");
        double favoriteDecimal = reader.nextDouble();
        reader.nextLine(); // Consume newline

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = reader.nextBoolean();
        reader.nextLine(); // Consume newline

        System.out.print("Enter your favorite letter: ");
        String letterInput = reader.next(); // Read the first token (character)
        char favoriteLetter = letterInput.charAt(0); // Get the first character

        System.out.println("\nYour age: " + age);
        System.out.println("Your favorite decimal: " + favoriteDecimal);
        System.out.println("Are you a student? " + isStudent);
        System.out.println("Your favorite letter: " + favoriteLetter);

        reader.close();
    }
}