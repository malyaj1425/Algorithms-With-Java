import java.util.*;

public class Numberconvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Decimal To Binary");
        System.out.println("2. Decimal To Octal");
        System.out.println("3. Decimal To Hexadecimal");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int n1 = sc.nextInt();
                int binary = 0;
                int placeVal1 = 1;
                while (n1 > 0) {
                    int rem = n1 % 2;
                    binary += rem * placeVal1;
                    placeVal1 *= 10;
                    n1 /= 2;
                }
                System.out.println(binary);
                break;
            case 2:
                int n = sc.nextInt();
                int octal = 0;
                int placeVal = 1;
                while (n > 0) {
                    int rem = n % 8;
                    octal += rem * placeVal;
                    placeVal *= 10;
                    n /= 8;
                }
                System.out.println(octal);
                break;
            case 3:
                // int res=0;
                // int n3 = sc.nextInt();
                // while (n3 > 0){
                //     int rem=n3%16;
                //     if(rem<=9){
                        
                //     }
                }
                break;      
        }
    }
}
