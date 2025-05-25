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

    }
    
}
