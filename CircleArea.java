import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);

        sc.close();
    }
}