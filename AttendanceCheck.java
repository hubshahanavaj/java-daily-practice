import java.util.Scanner;
public class AttendanceCheck{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Total Working days: ");
    int totalWorkingDays =sc.nextInt();
    
    System.out.println("Enter your persent day: ");
    int persentDays = sc.nextInt();

    int attendancePercentage = ((persentDays * 100) / totalWorkingDays);
    if (attendancePercentage >= 75){
        System.out.println("Eligible");
    }else{
        System.out.println("Not Eligible");
    }
    sc.close();
}
}
