public class Clock
{
  public static int Past(int h, int m, int s) 
  {
    int milisecondSum = (h * 3600000) + (m * 60000) + (s * 1000);
    return milisecondSum;
  }
}
