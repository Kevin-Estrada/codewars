public class Kata {
  public static String highAndLow(String numbers) {
    String[] numArr = numbers.split(" ");
    int highestNum = Integer.valueOf(numArr[0]);
    int lowestNum = Integer.valueOf(numArr[0]);
    for(int i=0; i<numArr.length; i++){
      if(Integer.valueOf(numArr[i])> highestNum){
        highestNum = Integer.valueOf(numArr[i]);
      }
      if(Integer.valueOf(numArr[i])< lowestNum){
        lowestNum = Integer.valueOf(numArr[i]);
      }
    }
    return highestNum + " " + lowestNum;
  }
}
