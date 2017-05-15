import java.util.Scanner;


public class UnicorStore {

    static Scanner scan = new Scanner(System.in);


    private static void displayMenu() {
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

    private static void sale() {

    }

    private static void print() {

    }

    private static void exit() {

    }

    public static void main() {

        displayMenu();

    }

}
