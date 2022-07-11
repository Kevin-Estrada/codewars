package kata.kyu8;

/*
 Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) 
 that receive a list of integers as input, and return the largest and lowest number in that list, respectively.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5
Notes
You may consider that there will not be any empty arrays/vectors.
 */

public class MinMaxProblem {
	public int min(int[] list) {
		int temp = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i] <= temp) {
				temp = list[i];
			}
		}
		return temp;
	}

	public int max(int[] list) {
		        int temp = list[0];
		    for(int i = 0; i < list.length; i++){
		      if(list[i] >= temp){
		        temp = list[i];
		      }
		    }
		    return temp;
	}
}

// Another way to solve the above problem using Arrays Class

/*
 * import java.util.Arrays;
 * 
 * public class Kata {
 * 
 * public int min(int[] list) { return Arrays.stream(list).min().getAsInt(); }
 * 
 * public int max(int[] list) { return Arrays.stream(list).max().getAsInt(); } }
 */

// Another way to solve the problem using sorting from Array's class

/*
 * import java.util.Arrays; public class Kata {
 * 
 * public int min(int[] list) { Arrays.sort(list); return list[0]; }
 * 
 * public int max(int[] list) { Arrays.sort(list); return list[list.length-1]; }
 * }
 */