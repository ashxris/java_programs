import java.util.Scanner;

public class do_while {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number ;

        do{
            System.out.println("Enter a number between 1-10.");
            number = scanner.nextInt();
        }
        while(number <=0 || number >=10);
        

        System.out.println("You have entered the number: "+ number);

        scanner.close();
    }
    
}
