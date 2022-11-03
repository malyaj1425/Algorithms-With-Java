import java.io.*;
import java.util.Scanner;

public class writinginformat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=1;j<n+1;j++){
                int x=a;
                for(double k=0;k<j;k++){
                    double y=Math.pow(2,k);
                    int value = (int)y;
                    x=x+value*b;
                }
                System.out.print(x+" ");
            }
            
        }
        
        in.close();
        }}