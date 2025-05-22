import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String response ="";

        while(!response.equals("Q")){
            System.out.println("You are playing this game.");
            System.out.print("Press Q to quit --> ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have successfully quitted the game.");

        scanner.close();
        
    }
    
}
