import java.util.Scanner;

public class EmployeeAgeValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee age:");
        int age = sc.nextInt();

        if (age >= 18 && age <= 60) {
            System.out.println("Valid Employee Age");
        } else {
            System.out.println("Invalid Age");
        }

        sc.close();
    }
}