import java.util.Scanner;

public class EmployeeIDCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee ID:");
        int employeeID = sc.nextInt();

        if (employeeID > 0) {
            System.out.println("Valid ID");
        } else {
            System.out.println("Invalid ID");
        }

        sc.close();
    }
}