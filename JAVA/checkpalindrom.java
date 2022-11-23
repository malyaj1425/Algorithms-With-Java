import java.util.*;
public class checkpalindrom {
    static Boolean ispal(String a,int i){
        if(i>a.length()/2){
            return true;
        }
        return (a.charAt(i)==a.charAt(a.length()-i-1)&&ispal(a,i+1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements Of Array:");
        int arr[]=new int[10];
        int x=0;
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(ispal(Integer.toString(arr[i]), x)){
                System.out.println(arr[i]+" is palindrome");
            }
            else{
                System.out.println(arr[i]+" is not palindrome");
            }
        }

    }
}
