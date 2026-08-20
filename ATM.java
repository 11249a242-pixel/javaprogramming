import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 500000;

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance! Withdrawal cannot be processed."
                );
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: Rs. " + balance);

        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}