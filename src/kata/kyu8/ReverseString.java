public class Kata {

  public static String solution(String str) {
    String reversedString="";
for(int i=1; i <= str.length(); i++){
  reversedString= reversedString + str.charAt(str.length()-i);
}
    return reversedString;
  }

}
