import java.util.Scanner;

public class AccountBalanceCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = sc.nextDouble();

        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            System.out.println("Withdrawal Allowed");
        } else {
            System.out.println("Withdrawal Not Allowed");
        }

        sc.close();
    }
}
