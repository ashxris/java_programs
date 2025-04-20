public class primitive_datatypes {
    
    public static void main (String[] args){

        //Use of primitive datatypes in java (int, double, char, boolean)

        int age = 45;
        double principle = 47999.50;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println(age);
        System.out.println("The principle is " + principle);
        System.out.println(grade);
        System.out.println(isStudent);

        if (isStudent){
            System.out.println("You are a student.");
        }
        else {
            System.out.println("You are NOT a student.");
        }

    }
    
}
