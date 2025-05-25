import java.util.Scanner;
import java.util.Arrays;

public class arrays {

    public static void main(String[] args){

        String[] animal = {"Tiger", "Owl", "Dog", "Lion"};

        animal[2] = "cat";
        System.out.println(animal[2]);

        Arrays.sort(animal);

        int numofanimals = animal.length;
        System.out.println(numofanimals);

        for (int i=0;i<animal.length;i++){
            System.out.println(animal[i]);
        }

        for (String animalString: animal){
            System.out.println(animalString);

        }

        Arrays.fill(animal, "cat");
        for (int i=0;i<animal.length;i++){
            System.out.println(animal[i]);
        }

        //USER INPUT IN ARRAY

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many # of color do you want?");
        int numberofColors = scanner.nextInt();
        scanner.nextLine();

        String[] color= new String [numberofColors];

        for(int i =0; i< numberofColors;i++){
            System.out.print("Enter the color name: ");
            color[i]= scanner.nextLine();
        }

        for(String colorName: color){
            System.out.println(colorName);
        }

        scanner.close();

    }
    
}
