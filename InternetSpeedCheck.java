import java.util.Scanner;

public class InternetSpeedCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter internet speed:");
        int speed = sc.nextInt();

        if (speed >= 100) {
            System.out.println("Excellent");
        } else if (speed >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Slow");
        }

        sc.close();
    }
}