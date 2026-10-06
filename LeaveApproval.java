import java.util.Scanner;

public class LeaveApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter available leave balance:");
        int availableLeave = sc.nextInt();

        System.out.println("Enter requested leave days:");
        int requestedLeave = sc.nextInt();

        if (requestedLeave <= availableLeave) {
            System.out.println("Leave Approved");
        } else {
            System.out.println("Leave Rejected");
        }

        sc.close();
    }
}