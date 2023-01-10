import java.util.HashMap;
public class isogram {
    public static boolean  isIsogram(String str) {
      HashMap<Character,Integer> map = new HashMap<Character, Integer>();
      String lowerCaseWord = str.toLowerCase();
      for(int i = 0; i < str.length(); i++){
        if(!map.containsKey(lowerCaseWord.charAt(i))){
          map.put(lowerCaseWord.charAt(i),1);
        } else {
          return false;
        }
      }
      return true;
    } 
}
