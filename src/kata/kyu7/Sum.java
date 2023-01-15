public class Sum {
    public int GetSum(int a, int b) {
        int sum = 0;
        int max = 0;
        int min = 0;
        if (a == b) {
            System.out.println(sum);
            return a;
        } else {
            if (a < b) {
                min = a;
                max = b;
            } else {
                max = a;
                min = b;
            }
            for (int i = min; i <= max; i++) {
                System.out.println(sum);
                sum += i;
            }
            return sum;
        }
    }
}