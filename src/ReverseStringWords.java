import java.util.regex.Pattern;

public class ReverseStringWords {

  public static String reverseWords(String str) {
    String result = "";

    Pattern p = Pattern.compile("\\s");   // Hello World

    String[] t = p.split(str);

    for (int i = 0; i < t.length; i++) {
      if (i == t.length - 1) {
        result = t[i] + result;
      } else {
        result = " " + t[i] + result;
      }
    }
    return result;
  }


  public static void main(String[] args) {
    System.out.println(reverseWords("Hello World"));
  }

}
