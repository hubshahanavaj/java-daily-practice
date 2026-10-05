import java.util.Scanner;
public class SoftwareLicenseCheck {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of licenses purchased: ");
        int avilableLicense = sc.nextInt();
        System.out.println("enter the number of licenses required: ");
        int userRequiredLicense = sc.nextInt();

         if(userRequiredLicense <= avilableLicense){
            System.out.println("License is avilable");
         }else{
            System.out.println("License is not avilable");
         }sc.close();
    }
 }
