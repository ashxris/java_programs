import java.util.Scanner;

public class twoD_arrays {
    public static void main(String[] args){

        char[][] numpad = {
                    {'1','2','3'},
                    {'4','5','6'},
                    {'7','8','9'},
                    {'*','0','#'}
        };

        for(char[] row: numpad){
            for(char number:row){
                System.out.print(number+" ");
            }
            System.out.print("\n");
        }
    }
    
}
