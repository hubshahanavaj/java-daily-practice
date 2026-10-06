import java.util.Scanner;

public class EmployeeLoginCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("java123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }
}