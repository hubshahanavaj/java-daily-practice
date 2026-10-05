import java.util.Scanner;
public class ProjectBonus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rating= sc.nextInt();
        if(rating == 5){
            System.out.println("Bonus is 10,000:");
        }else if(rating == 4){
            System.out.println("Bnonus is 5,000:");
        }else {
            System.out.println("Bonus not avilable:");

    
        sc.close();
    }
    }
    }