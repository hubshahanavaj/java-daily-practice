import java.util.Scanner;

public class WorkFromHomeEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee experience in years:");
        int experience = sc.nextInt();

        System.out.println("Enter performance rating:");
        int rating = sc.nextInt();

        if (experience >= 2 && rating >= 4) {
            System.out.println("Eligible for Work From Home");
        } else {
            System.out.println("Not Eligible for Work From Home");
        }

        sc.close();
    }
}