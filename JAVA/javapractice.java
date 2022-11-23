import java.util.*;
import java.math.*;
class mathematicalproblem{
    public static void primefactor(int value){
        for(int i=2;i<value;i++){
            while(value%i==0){
                System.out.println(i+" ");
                value=value/i;
            }
        }
        if(value>2){
            System.out.println(value);
        }
    }
    
}
class searching{
    public static Boolean linearsearch(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public static Boolean binarysearch(int arr[],int n,int l,int r){
        int first=0;
        if(arr[first]==n){
            return true;
        }
        Arrays.sort(arr);
        int mid=(l+r)/2;
        if(arr[mid]==n){
            return true;
        }
        else if(n>arr[mid]){
            return binarysearch(arr, n, mid, r);
        }
        else{
            return binarysearch(arr,n,l,mid-1);
        }
    }
    public static Boolean exponentialsearch(int arr[],int n,int x){
        if(arr[0]==n){
            return true;
        }
        int i=1;
        while(i<x&&arr[i]<=x){
            i=i*2;
        }
        return binarysearch(arr, x, i/2, Math.min(i,n-1));
    }
}

public class javapractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array:  ");
        int size=sc.nextInt();
        System.out.println("Enter Elements");
        int a[]= new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter value you wish to search: ");
        int value=sc.nextInt();
        System.out.println("LINEAR SEARCH:");
        boolean check=searching.linearsearch(a, value);
        if(check==true){
            System.out.println("ELEMENT FOUND");
        }
        System.out.println("BINARY SEARCH:");
        boolean check2=searching.binarysearch(a,value,0,size-1);
        if(check2==true){
            System.out.println("ELEMENT FOUND");
        }
        System.out.println("EXPONENTIAL SEARCH");
        boolean check3=searching.exponentialsearch(a, size, value);
        if(check3==true){
            System.out.println("ELEMENT FOUND");
        }

    }
    
}
