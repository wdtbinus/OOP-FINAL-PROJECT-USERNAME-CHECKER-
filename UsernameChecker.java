import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsernameChecker {
    private static List<String> usernames;

    public static void main(String[] args) {
        usernames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Username Checker -----");
            System.out.println("1. Register Username");
            System.out.println("2. Check Username Availability");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUsername(scanner);
                    break;
                case 2:
                    checkUsernameAvailability(scanner);
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void registerUsername(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (usernames.contains(username)) {
            System.out.println("Username already taken. Please choose a different username.");
        } else {
            usernames.add(username);
            System.out.println("Username registered successfully.");
        }
    }

    private static void checkUsernameAvailability(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (usernames.contains(username)) {
            System.out.println("Username is already taken.");
        } else {
            System.out.println("Username is available.");
        }
    }
}
