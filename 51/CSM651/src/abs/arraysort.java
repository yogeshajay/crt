package abs;
import java.util.Arrays;
import java.util.Collections;
public class arraysort {
	public static void main(String[]args) {
		int[] primes = {2,17,5,23,11};
	System.out.println("array before sorting :"+Arrays.toString(primes));
	Arrays.sort(primes);
	System.out.println("array after sorting :"+Arrays.toString(primes));
	String[] fruits= {"apple","banana","orange","grapes"};
	System.out.println("String array before sortoing:"+Arrays.toString(fruits));

	System.out.println("String array in descending order:");
    Arrays.sort(fruits,Collections.reverseOrder());
	System.out.println("String array after sortoing:"+Arrays.toString(fruits));
	}

}
