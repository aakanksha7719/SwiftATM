import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        if (bank.authenticateUser(userId, pin)) {
            ATM atm = new ATM(bank.getUser(userId));
            atm.start();
        } else {
            System.out.println("Authentication failed. Please check your User ID and PIN.");
        }
    }
}
