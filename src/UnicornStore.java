import java.util.Scanner;

public class UnicornStore {

    public static Scanner scan = new Scanner(System.in);

    //UI to give user options. If 1, sale. If 2, print. If 3, Exit.
    private static void displayMenu(String list, double total) {
        String receipt = "";
        double initial = 0;
        System.out.println("Welcome to Unicorn Exports!");
        System.out.println("Choose an option:");
        System.out.println("---------------------------");
        System.out.println("1) Sale");
        System.out.println("2) Print");
        System.out.println("3) Exit");
        int option = scan.nextInt();
        switch (option) {
            case 1: {
                sale(receipt, initial);
            } break;
            case 2: {
                print(list, total);
            } break;
            default: {
                System.exit(0);
            }
        }
    }

    //Takes user input and adds results to String "list".
    private static String sale(String list, double total) {

        System.out.println("Type item name.");

        String saleItemName = scan.next();

        System.out.println("How many items would you like?");

        int saleItemQuantity = scan.nextInt();

        System.out.println("What price would you like to pay?");

        double saleItemPrice = scan.nextDouble();

        System.out.println("Would you like to add another item to your cart? Y/N");

        String cart = scan.next();

        //Adds user input to "list".
        list += (saleItemName + " " + "x(" + saleItemQuantity + ") " + saleItemPrice + " " + " \n");
        getTotal(list);

        //If user selects "y", calls sale() again and passes "list" as parameter.
        if (cart.equalsIgnoreCase("y")) {
            sale(list, total);

        } else {
            displayMenu(list, total);
            return list;
        } return list;

    }

    //Literally just prints list.
    private static void print(String list, double total) {

        System.out.println(list);
        System.out.println("Your Total: "+ total);

    }

    private static String getTotal(String list) {

        String amount = list.substring(list.indexOf(") ")+1, list.lastIndexOf(" "));
        String price = list.substring(list.indexOf("x(")+2, list.indexOf(") "));
        System.out.println(price + amount);

        return price;
    }

    public static void main(String[] args) {

        String list = "";
        double total = 0;

        displayMenu(list, total);

    }

}
