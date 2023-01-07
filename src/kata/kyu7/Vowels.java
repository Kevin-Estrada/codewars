public class Vowels {

  public static int getCount(String str) {
    int totalVowels = 0;
    for(int i = 0; i < str.length();i++){
      char currentLetter = str.charAt(i);
      if(currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u')
        totalVowels+=1;
    }
    return totalVowels;
  }

}