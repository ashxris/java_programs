import java.util.Scanner;
import java.util.Random;

public class number_guess_game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random randomgenerator = new Random();

        int guess;
        int attempts=0;

        //GENERATED A RANDOM NUMBER AND STORED IN randomNumber
        int randomNumber = randomgenerator.nextInt(1,11);
        
        do{
            System.out.println("Enter a number between 1-10");
            guess = scanner.nextInt();
            attempts++;
        }while (guess != randomNumber);

        System.out.println("You have won the game.");
        System.out.println("# of attempts used "+attempts);


         scanner.close();

    }
    
}
