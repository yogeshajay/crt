package abs;

import java.util.Arrays;

public class subrray {
public static void main(String[]args) {
	String[] bestCreditCards = {"A","B","C","D"};
	String[] B=new String[4];
	System.arraycopy(bestCreditCards, 0, B, 0, 4);
	System.out.println("orignal array:"+Arrays.toString(bestCreditCards));
	System.out.println("sub array:"+Arrays.toString(B));
}
}
