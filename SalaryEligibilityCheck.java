import java.util.Scanner;

public class SalaryEligibilityCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary = sc.nextInt();

        if (salary >= 30000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
