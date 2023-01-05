public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int smallestInt = args[0];
      for(int i = 0; i < args.length; i++){
        if(args[i] < smallestInt){
          smallestInt = args[i];
        }
      }
      return smallestInt;
    }
}