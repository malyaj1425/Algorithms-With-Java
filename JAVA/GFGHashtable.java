import java.util.*;

public class GFGHashtable{
    public static void main(String[] args) {
        Map<Integer,String> h1= new HashMap<>();
        h1.put(1,"John");
        h1.put(2,"Clay");
        h1.put(3,"Chris");
        h1.put(4,"Anton");

        h1.remove(2);

        Hashtable<Integer,String> h2= new Hashtable<>(h1);

        for(Map.Entry<Integer, String> e: h1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        

    }
}