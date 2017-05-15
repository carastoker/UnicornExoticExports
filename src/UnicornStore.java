import java.util.Scanner;


public class UnicornStore {

    public static Scanner scan = new Scanner(System.in);

    private static void displayMenu(String name, double price, int quantity) {
        String nombre = name;
        double money = price;
        int amount = quantity;
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
                print(nombre, money, amount);
            } break;
            default: {
                System.exit(0);
            }
        }
    }

    private static void sale() {

        System.out.println("Type item name.");

        String saleItemName = scan.next();

        System.out.println("How many items would you like?");

        int saleItemQuantity = scan.nextInt();

        System.out.println("What price would you like to pay?");

        double saleItemPrice = scan.nextDouble();

        System.out.println("Would you like to add another item to your cart? Y/N");

        String cart = scan.next();

        if (cart.equalsIgnoreCase("y")) {
            sale();
        } else {
            displayMenu(saleItemName, saleItemPrice, saleItemQuantity);
        }

    }

    private static void print(String name, double price, int quantity) {

        System.out.println(name + "  " + quantity + "  " + price);

    }

    private static void exit() {

    }

    public static void main(String[] args) {

        String name = "name";
        double price = 0.00;
        int quantity = 0;

        displayMenu(name, price, quantity);

    }

}
