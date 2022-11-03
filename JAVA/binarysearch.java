import java.util.Scanner;
import java.util.*;

public class binarysearch {
    static void bs(int arr[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.println("Element fount at index "+mid);
                break;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");int size=sc.nextInt();
        boolean flag=false;
        
        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element you wish to search");
        int searchitem=sc.nextInt();
        bs(arr,0,size-1,searchitem);

    }
}
