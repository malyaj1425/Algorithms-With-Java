
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class largestprime {
    
    static void function(long n,int i,int arr[]){
        if(i<n){
            if(n%i==0){
                if(arr[0]<i){
                    arr[0]=i;
                }
            }
            function(n, i+1, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i=1;
        int arr[]=new int[1];
        arr[0]=0;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            function(n, i, arr);
            System.out.println(arr[0]);
        }
    }
}
