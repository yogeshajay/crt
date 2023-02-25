package abs;

import java.util.Arrays;

public class aryequal {
public static void main(String[]args) {
	int [] primes = {3,5,7};
	int[] odds = {};
	boolean isEqual = Arrays.equals(primes, odds);
	if (isEqual) {
		System.out.printf("array %s and %s are equal" +"%n",Arrays.toString(primes),Arrays.toString(odds));
	}
	else {
		System.out.printf("array %s and %s are not equal" +"%n",Arrays.toString(primes),Arrays.toString(odds));
	}
}
}
