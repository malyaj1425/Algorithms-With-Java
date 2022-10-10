import java.util.*;
import java.io.*;
import java.util.Arrays;
class gcd{
    
}
public class hcf {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.print("Input First Number: ");x=sc.nextInt();
        System.out.print("Input Second Number: ");y=sc.nextInt();

        int arr1[]=new int[50];
        int arr2[]=new int[50];
        int j1=0;
        for (int i=1;i<x+1;i++){
            if(x%i==0){
                arr1[j1]=i;
                j1++;
            }
        }
        int j2=0;
        for (int i=1;i<x+1;i++){
            if(y%i==0){
                arr2[j2]=i;
                j2++;
            }
        }

        int set[]=new int[50];
        int z=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // add common elements
                    set[z]=(arr1[i]);
                    z++;
                    break;
                }
            }
        }
        int i;
         
        // Initialize maximum element
        int max = set[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < set.length; i++)
            if (set[i] > max)
                max = set[i];
         
        System.out.println(max);
        

    }
}
