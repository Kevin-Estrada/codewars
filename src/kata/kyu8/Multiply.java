package kata.kyu8;

public class Multiply {
	public static Double multiply(Double a, Double b) {
		return a * b;
	}
}

// Below is a pretty neat way to account for null values!
/*
 public class Multiply {
    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }
} 
 */