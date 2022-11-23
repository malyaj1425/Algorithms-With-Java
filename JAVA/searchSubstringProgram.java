import java.util.Scanner;

class searchSubstring {
    private String mainString = new String();
    private String subString = new String();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        mainString = sc.nextLine();
        System.out.println("Enter the substring: ");
        subString = sc.nextLine();
        sc.close();
    }

    public void search() {
        int index = mainString.indexOf(subString);
        if (index == -1) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Substring found at index: " + index);
        }
    }

    public void findNumberOfOccurences() {
        int index = mainString.indexOf(subString);
        int count = 0;
        while (index != -1) {
            count++;
            index = mainString.indexOf(subString, index + 1);
        }
        System.out.println("Number of occurences: " + count);
    }
}

public class searchSubstringProgram {

    public static void main(String[] args) {
        searchSubstring obj = new searchSubstring();
        obj.input();
        obj.search();
        obj.findNumberOfOccurences();
    }

}