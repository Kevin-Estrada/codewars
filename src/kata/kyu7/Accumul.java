public class Accumul {
    
    public static String accum(String s) {
      int count = 0 ;
      String result = "";
      for(int i = 0; i < s.length(); i++){
        char firstLetter = Character.toUpperCase(s.charAt(i));
        result = result + firstLetter;
        int counter = 0;
          while(counter < count){
            result = result + Character.toLowerCase(firstLetter);
            counter+=1;
          }
        count += 1;
        result = result + "-";
      }
      return result.substring(0,result.length()-1);
    }
}
