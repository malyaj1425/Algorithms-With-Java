import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        int samplesize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sample size");
        samplesize = sc.nextInt();
        int num[] = new int[samplesize];
        for (int i = 0; i < samplesize; i++) {
            System.out.println("Enter a Value");
            num[i] = sc.nextInt();
        }

        int max = num[0];
        for (int i = 0; i < samplesize; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        int Hash[] = new int[max + 1];
        for (int i = 0; i <samplesize; i++) {
            Hash[num[i]] = num[i];
        }

        for(int i=0;i<=max;i++)System.out.print(Hash[i]+" ");
        System.out.println(" ");
        int HashDiv[] = new int[max + 1];
        for (int i = 0; i <samplesize; i++) {
            HashDiv[num[i]%5] = num[i];
        }

        for(int i=0;i<=max;i++)System.out.print(HashDiv[i]+" ");

    }
}
