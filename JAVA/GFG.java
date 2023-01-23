import java.io.*;
import java.lang.Math;
import java.util.Vector;
import java.util.*;
 
class GFG
{
    
    public static void smallestprimeFactors(int n)
    {
        Vector<Integer> v = new Vector<Integer>(n);
        int sum=0;
        v.clear();

        
        while (n%2==0)
        {
            sum+=2;
            v.add(2);
            n /= 2;
            
        }
 
        
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            
            while (n%i == 0)
            {
                sum+=i;
                v.add(i);
                n /= i;
                
            }
        }
 
        
        if (n > 2){
            sum+=n;
            v.add(n);}
        
        if(v.size()==1){
            for (int i = 0; i < v.size(); i++)
                System.out.print(v.get(i) + " ");
            return;
        }
        smallestprimeFactors(sum);
        
        
    }
 
    public static void main (String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Vector<Integer> v = new Vector<Integer>(n);
        
        smallestprimeFactors(n);
        
    }
}