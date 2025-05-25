import java.util.Arrays;

public class array_search {

    public static void main(String[] args){

        //NUMBER SEARCH
        int[] number = {1,4,3,9,7,0};
        int target = 9;

        for(int i=0;i<number.length;i++){
            if(target==number[i]){
                System.out.println("Integer element found at index "+ i);
                break;
            }

        }

        //STRING SEARCH
        String[] fruits={"apple","mango","orange"};
        String targetFruit = "mango";

        for(int j=0; j<fruits.length;j++){
            if(fruits[j].equals(targetFruit)){
                System.out.println("String element found at index: "+j);
            }
        }

    }
    
}
