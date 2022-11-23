package bub;
import java.util.*;
public class bubblesort {
    static void bubble(int arr[]){
        int n=arr.length;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<n-j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int arr[]=new int[7];
     for(int i=0;i<7;i++){
        arr[i]=sc.nextInt();
     }   
     bubble(arr);
     for(int i=0;i<7;i++){
        System.out.print(arr[i]+" ");
     }   

    }
}
