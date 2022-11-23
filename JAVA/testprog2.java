import java.lang.reflect.Array;
import java.util.*;
public class testprog2 {
    public static void main(String[] args) {
        String str = "welcometojava";  
        int len = str.length();  
        int temp = 0;  
        //Total possible subsets for string of size n is n*(n+1)/2  
        
        Vector<String> arr=new Vector<>(); 
  
        //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  

                String sx = str.substring(i, j+1);
                if(sx.length()==3){
                    arr.add(sx);
                }
                temp++;  
            }  
        }
        Collections.sort(arr);
        //This loop prints all the subsets formed from the string.  
         
        
        for(int i = 0; i < arr.size(); i++) {  
            System.out.println(arr.get(i));  
        }
    }
}
