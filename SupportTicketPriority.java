import java.util.Scanner;

public class SupportTicketPriority {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ticket severity (1-3):");
        int severity = sc.nextInt();

        if (severity == 1) {
            System.out.println("Low");
        } else if (severity == 2) {
            System.out.println("Medium");
        } else if (severity == 3) {
            System.out.println("High");
        } else {
            System.out.println("Invalid Severity");
        }

        sc.close();
    }
}