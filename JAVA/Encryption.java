import java.util.Scanner;
import java.util.*;

public class Encryption {

    static String encryption(String s) {
        int length = s.length();
        double rows = Math.floor(Math.sqrt(length));
        double cols = Math.ceil(Math.sqrt(length));
        int len = (int) (rows > cols ? rows : cols);
        String result = "";
        for (int i = 0; i < len; i++) {
            for (int j = i; j < s.length(); j = (int) (j + cols)) {
                char ch = s.charAt(j);
                result += ch;
            }
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String s = in.next();
        // String result = encryption(s);
        // System.out.println(result);

        String s = "This2 is3 a5 s4ample se4ntence.";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        for (int i = words.length - 1; i >= 0; i--) {

            String input = "hel3o";

            StringBuilder builder = new StringBuilder();
            char previousChar = ' ';
            for (char c : words[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    builder.append(String.join("",
                            Collections.nCopies(Character.getNumericValue(c) - 1, String.valueOf(previousChar))));
                    continue;
                }

                builder.append(c);
                previousChar = c;
            }
            System.out.print(builder + " ");
        }
        in.close();

    }
}