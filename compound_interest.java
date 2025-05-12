import java.util.Scanner;

public class compound_interest{
    public static void main (String[] args){

        double principal;
        int time;
        double amount;
        int numberoftimescompounded;
        double rate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the principal: ");
        principal = scanner.nextDouble();

        System.out.println("Please enter the rate of interest (in %): ");
        rate = scanner.nextDouble();
        rate /= 100;
        System.out.println("Your entered rate is "+rate);

        System.out.println("Please enter the number of times its compounded in a year: ");
        numberoftimescompounded = scanner.nextInt();

        System.out.println("Please enter the time spent: ");
        time = scanner.nextInt();

        amount = principal* Math.pow(1+(rate/numberoftimescompounded), numberoftimescompounded*time);

        System.out.printf("The calculated amout is %.2f", amount);

        scanner.close();

    }
}
