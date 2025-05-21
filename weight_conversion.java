import java.util.Scanner;

public class weight_conversion {
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner (System.in);

        double weight;
        double new_weight;
        int choice;
        
        System.out.println("Welcome to the weight conversion program!");
        System.out.println("Enter your choice");
        System.out.println("1. Convert lbs into kgs");
        System.out.println("2. Convert kgs into lbs");

        choice = scanner.nextInt();

        if(choice ==1 ){
            System.out.print("Enter your weight in lbs. ");
            weight = scanner.nextDouble();
            new_weight = weight * 0.4535;
            System.out.printf("Your weight in kgs is %.2f", new_weight);
        }
        else if(choice ==2 ){
            System.out.print("Enter your weight in kgs. ");
            weight = scanner.nextDouble();
            new_weight = weight * 2.2046;
            System.out.printf("Your weight in lbs is %.2f", new_weight);
        }

        else{
            System.out.println("You've entered a invalid choice.");
        }

        scanner.close();

    }
    
}
