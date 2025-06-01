public class objectArray {

    String name;

    //made a constructor
    public objectArray(String name){
        System.out.println("My name is : "+name);

    }

    public static void main (String[] args){

        objectArray[] name = {new objectArray("Nitin"), new objectArray("Rudra")};
    }
    
}
