import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {

        System.out.println("Welcome to the shopping cart program.");
        System.out.println("Which item do you want to add in your cart?");
        System.out.println("1. Apple - $1.00");
        System.out.println("2. Banana - $0.50");
        System.out.println("3. Orange - $0.75");
        System.out.println("Enter the item number: ");

        Scanner item = new Scanner(System.in);

        int itemnumber = item.nextInt();
        item.nextLine();
        System.out.println("Enter the number of stock you want to add in your cart?");
        int itemstock = item.nextInt();
        item.nextLine();

        if(itemstock >100){
            System.out.println("SORRY! We cannot offer you this much stock at once.");
        }
        
        //Conditons
        if(itemnumber == 1){
            System.out.println("You total will be $" + 1*itemstock);
        }
        else if (itemnumber == 2) {
            System.out.println("You total will be $" + 0.5*itemstock);
            
        } else if (itemnumber == 3) {
            System.out.println("You total will be $" + 0.75*itemstock);
            
        }
        else {
            System.out.println("You have entered an invalid item number.");
        }


        item.close();

    }

    
}
