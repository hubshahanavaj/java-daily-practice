import java.util.Scanner;

public class CompanyPurchaseDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase amount:");
        double purchaseAmount = sc.nextDouble();

        double discount;

        if (purchaseAmount > 50000) {
            discount = purchaseAmount * 15 / 100;
        } else {
            discount = purchaseAmount * 5 / 100;
        }

        double finalAmount = purchaseAmount - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}