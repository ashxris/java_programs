import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score;
        

        System.out.print("Enter your score: ");
        score = scanner.nextInt();
        
        //TERNARY OPERATOR
        String result = (score>=60)? "PASS":"FAIL";

        System.out.println(result);
        
        scanner.close();
    }
}


