import java.util.Scanner;

public class SoftwareBillingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of licenses:");
        int licenses = sc.nextInt();

        System.out.println("Enter price per license:");
        double pricePerLicense = sc.nextDouble();

        double totalCost = licenses * pricePerLicense;
        double finalBill;

        if (totalCost > 100000) {
            double discount = totalCost * 10 / 100;
            finalBill = totalCost - discount;
        } else {
            finalBill = totalCost;
        }

        System.out.println("Total Cost: " + totalCost);
        System.out.println("Final Bill: " + finalBill);

        sc.close();
    }
}