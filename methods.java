import java.util.Scanner;

public class methods {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //USER INPUTS A NUMBER
        System.out.print("Enter the number you want the square of: ");
        double num = scanner.nextDouble();

        //FUNCTION CALL
        double square = squareCalculator(num);

        //PRINTS THE SQUARE
        System.out.printf("The square for the number %.2f is %.2f unit squares. ", num, square);

        scanner.close();

    }

    //FUNCTION DECLARATION
    public static double squareCalculator (double num){

        double square = num*num;
        return square;


    }
    
}
