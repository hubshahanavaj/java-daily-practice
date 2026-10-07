import java.util.Scanner;

public class SystemAccessCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is the user an employee? (true/false)");
        boolean isEmployee = sc.nextBoolean();

        System.out.println("Does the employee have an access card? (true/false)");
        boolean hasAccessCard = sc.nextBoolean();

        if (isEmployee && hasAccessCard) {
            System.out.println("Access Allowed");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}