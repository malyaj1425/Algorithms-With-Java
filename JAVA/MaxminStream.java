import java.util.*;
public class MaxminStream {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        int max=-2147483647;
        int min=2147483647;

        String choice=null;

        do{
            System.out.println("Enter a number");
            num=sc.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            System.out.println("you wish to continue..<y/n>");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("y"));

        System.out.println("MAX "+max);
        System.out.println("MIN "+min);
    }
}
