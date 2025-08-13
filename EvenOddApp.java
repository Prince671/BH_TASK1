import java.util.Scanner;

public class EvenOddApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHeader();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readMenuChoice(sc);

            switch (choice) {
                case 1:
                    int n = readInt(sc, "Enter an integer to check (even/odd): ");
                    if (isEven(n)) {
                        System.out.println("Result: " + n + " is EVEN ✅");
                    } else {
                        System.out.println("Result: " + n + " is ODD ✅");
                    }
                    break;
                case 2:
                    showHelp();
                    break;
                case 0:
                    running = false;
                    System.out.println("Goodbye! 👋");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }

            if (running) {
                System.out.println();
                System.out.print("Press Enter to continue...");
                sc.nextLine();
                sc.nextLine();
                System.out.println();
            }
        }
        sc.close();
    }

    private static void printHeader() {
        System.out.println("========================================");
        System.out.println("        Even/Odd Checker (Java)         ");
        System.out.println("========================================");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("Menu:");
        System.out.println("  1) Check a number (Even/Odd)");
        System.out.println("  2) Help");
        System.out.println("  0) Exit");
        System.out.print("Choose an option: ");
    }

    private static int readMenuChoice(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid choice. Enter 0, 1, or 2: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static int readInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("That's not an integer. Try again: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static void showHelp() {
        System.out.println();
        System.out.println("Help:");
        System.out.println("- This program checks if an integer is even or odd using the modulus operator (%).");
        System.out.println("- Logic: n % 2 == 0  => EVEN, else ODD.");
        System.out.println("- It safely handles non-integer inputs by re-prompting.");
        System.out.println("- Negative numbers are supported (e.g., -4 is EVEN).");
    }
}
