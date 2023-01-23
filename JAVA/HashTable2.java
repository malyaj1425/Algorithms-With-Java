import java.util.*;
public class HashTable2 {
    public static void main(String[] args) {
        int samplesize;
        int hashtable[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sample Size");
        samplesize = sc.nextInt();
        int i;
        int num[] = new int[samplesize];
        for (i = 0; i < samplesize; i++) {
            System.out.println("Enter a value");
            num[i] = sc.nextInt();

        }

        // Creating hash table
        
        for (i = 0; i < samplesize; i++) {
            int d = num[i] % 10;
            hashtable[d] = num[i];
        }

        for (i = 0; i < 10; i++) {
            System.out.print(hashtable[i]);
        }
    }
}
