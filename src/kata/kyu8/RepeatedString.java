public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      String repeatedString = "";
      for(int i = 0; i < repeat; i++){
        repeatedString = repeatedString + string;
      }
        return repeatedString;
    }
}
