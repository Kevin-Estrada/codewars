public class SquareDigit {

  public int squareDigits(int n) {
    String stringInt = String.valueOf(n);
    String concatnatedNumbers = "";
    for(int i = 0; i < stringInt.length(); i++){
      int singleDigit = Integer.parseInt(String.valueOf(stringInt.charAt(i)));
      concatnatedNumbers = concatnatedNumbers + (singleDigit * singleDigit);
    }
    return Integer.parseInt(concatnatedNumbers);
  }

}
