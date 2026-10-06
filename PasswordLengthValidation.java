import java.util.Scanner;
public class PasswordLengthValidation {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password: ");
    String password = sc.nextLine();
    if(password.length() >= 8){
        System.out.println("Password is valid");
    }else{
        System.out.println("Password is not valid");
    }
    sc.close();
}
}