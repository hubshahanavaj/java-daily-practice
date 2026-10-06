import java.util.Scanner;

public class OvertimeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your working hours:");
        int workingHours = sc.nextInt();

        if (workingHours > 8) {
            int overtimeHours = workingHours - 8;
            System.out.println("Overtime hours: " + overtimeHours);
        } else {
            System.out.println("No overtime");
        }

        sc.close();
    }
}