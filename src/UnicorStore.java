import java.util.Scanner;


public class UnicorStore {

    private static void displayMenu(Scanner scan) {
        System.out.println("Welcome to Unicorn Exports!");
        System.out.println("Choose an option:");
        System.out.println("---------------------------");
        System.out.println("1) Sale");
        System.out.println("2) Print");
        System.out.println("3) Exit");
        int option = scan.nextInt();
        switch (option) {
            case 1: {
                sale();
            } break;
            case 2: {
                print();
            } break;
            default: {
                System.exit(0);
            }
        }
    }

    private static void sale(Scanner scan) {

        System.out.println("Type item name.");

        String saleItemName = scan.nextLine();

        System.out.println("How many items would you like?");

        String saleItemQuantity = scan.next();

        System.out.println("What price would you like to pay?");

        String saleItemPrice = scan.nextLine();

        System.out.println("Would you like to add another item to your cart? Y/N");

        String cart = scan.next();

        if (cart.equalsIgnoreCase("y")) {
            sale();
        } else {
            displayMenu();
        }

    }

    private static void print() {

    }

    private static void exit() {

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        displayMenu(scan);
        sale(scan);

    }

}
