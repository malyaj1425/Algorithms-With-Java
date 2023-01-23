import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        String a="Mananjay";
        ArrayList<String> arr= new ArrayList<>();
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                arr.add(a.substring(i, j));
            }
        }
        System.out.println(arr);
    }
}
