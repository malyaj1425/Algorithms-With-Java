import java.util.*;

public class Stringscan {
    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str)  
{  
int count[] = new int[MAX_CHAR];  
int len = str.length();  
for (int i = 0; i < len; i++)  
count[str.charAt(i)]++;  
char ch[] = new char[str.length()];  
for (int i = 0; i < len; i++)   
{  
ch[i] = str.charAt(i);  
int find = 0;  
for (int j = 0; j <= i; j++)   
{  
if (str.charAt(i) == ch[j])  
find++;  
}             
if (find == 1)  

System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]); 
} 
}

    public static void main(String[] args) {
        String sentense = new String();
        Scanner sc = new Scanner(System.in);
        sentense = sc.nextLine();
        System.out.println(sentense.length());

        String word;
        word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < sentense.length(); i++) {
            if (sentense.charAt(i) == word.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
        count = 0;
        String vovels = new String("aeiou");
        for (int i = 0; i < sentense.length(); i++) {
            for (int j = 0; j < 5; j++) {
                if (sentense.charAt(i) == vovels.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        getOccuringChar(sentense);
    }
}
