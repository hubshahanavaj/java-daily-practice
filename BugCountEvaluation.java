import java.util.Scanner;

public class BugCountEvaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of bugs:");
        int bugs = sc.nextInt();

        if (bugs == 0) {
            System.out.println("Ready for Release");
        } else if (bugs >= 1 && bugs <= 5) {
            System.out.println("Minor Fixes Needed");
        } else {
            System.out.println("Release Blocked");
        }

        sc.close();
    }
}
