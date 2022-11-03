import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements Of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Elements Are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Enter Element which you wish to search: ");
        int x=sc.nextInt();
        int flag=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==1){
            System.out.println("Found at "+index);
        }
        else{
            System.out.println("Not Found!");
        }
    }
}
