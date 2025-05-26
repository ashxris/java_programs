public class var_args{

    public static void main(String[] args) {

        //CALLING THE FUNCTION WITH ARGUMENTS
        add(1,2,3,4);

    }

    static void add(int... numbers){

        int sum =0;

        //USING AN ENHANCED FOR LOOP FOR ADDING THE PARAMETERS
        for(int number : numbers){
            sum+=number;
        }

        System.out.println("The sum is: "+sum);

    }
}