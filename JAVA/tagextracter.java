import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tagextracter {
   public static void main(String[] args) {
      String str = "Welcome to <b>Tutorialspoint<b>";
      //Creating a pattern object
      Pattern pattern = Pattern.compile("<b>(\s+)</b>");
      //Matching the compiled pattern in the String
      Matcher matcher = pattern.matcher(str);
      if (matcher.find()) {
         String result = matcher.group(1);
         System.out.println(result);
      }
   }
}