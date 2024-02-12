import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying the menu and prompting the user for input
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        String choice = scanner.next();

        // Converting the user's choice to uppercase for easier comparison
        choice = choice.toUpperCase();

        // Checking the user's choice and responding accordingly
        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        scanner.close();
    }
}
