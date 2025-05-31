public class constructors {
    String brand;
    String processor;
    int ramGB;

    // Explicitly defined no-argument constructor
    public constructors() {
        System.out.println("A new laptop object is being created!");
        this.brand = "Generic Brand"; // Default brand
        this.processor = "Unknown CPU"; // Default processor
        this.ramGB = 8; // Default RAM
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand + ", Processor: " + processor + ", RAM: " + ramGB + "GB");
    }

    public static void main(String[] args) {
        constructors laptop1 = new constructors(); // Calls our no-arg constructor
        laptop1.displaySpecs(); // Output: Brand: Generic Brand, Processor: Unknown CPU, RAM: 8GB
    }
}