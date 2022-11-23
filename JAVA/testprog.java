import java.util.Scanner;
import java.util.*;

public class testprog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            double size1=Math.log10(arr[i])+1;
            int size=(int) size1;
            int sum=0,digit;
            int temp=arr[i];
            while(temp>0){
                digit = temp % 10; 
                sum=sum+digit;
                temp=temp/10;
            }
            System.out.println("Number of digits in "+arr[i]+" is "+size);
            System.out.println("Sum of Digits of "+arr[i]+" is "+sum);
            System.out.println(" ");
        }

    }
}
