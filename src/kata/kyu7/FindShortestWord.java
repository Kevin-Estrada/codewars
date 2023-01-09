public class Kata {
    public static int findShort(String s) {
      String[] arrString = s.split(" ");
      int shortestWord = arrString[0].length();
      for(String word: arrString){
        if(shortestWord > word.length())
        shortestWord = word.length();
      }
      return shortestWord;
    }
}
