public class objectArray {

    String name;

    // Constructor to initialize the name
    public objectArray(String name) {
        this.name = name; // Assign the value to the instance variable
        System.out.println("My name is: " + this.name);
    }

    public static void main(String[] args) {
        // Create an array of ObjectArray objects
        objectArray[] objects = {new objectArray("Tony"), new objectArray("John")};
    }
}
