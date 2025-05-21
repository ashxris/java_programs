import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char operator;
        double num1;
        double num2;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter your choice (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        
        switch (operator) {
            case '+': System.out.printf("Additon is %.2f", num1+num2);
                break;
            case '-': System.out.printf("Subtraction is %.2f", num1-num2);
                break;
            case '*': System.out.printf("Multiplication is %.2f", num1*num2);
                break;
            case '/': System.out.printf("Division is %.2f", num1/num2);
                break;
        
            default: System.out.println("Invalid character!");
                break;
        }

        scanner.close();
    }
    
}
