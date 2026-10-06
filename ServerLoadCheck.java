import java.util.Scanner;

public class ServerLoadCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter server load percentage:");
        int serverLoad = sc.nextInt();

        if (serverLoad < 50) {
            System.out.println("Server Load is Low");
        } else if (serverLoad <= 80) {
            System.out.println("Server Load is Normal");
        } else {
            System.out.println("Server Load is High");
        }

        sc.close();
    }
}