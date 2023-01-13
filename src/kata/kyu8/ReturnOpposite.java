import java.util.*;
public class ReturnOpposite
    {
        public static int opposite(int number)
        {
          return number < 1 ? Math.abs(number) : -Math.abs(number);
        }
    }
