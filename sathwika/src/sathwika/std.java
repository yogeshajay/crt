package sathwika;

import java.util.Scanner;

abstract class std2{
	abstract void std1 ();
	abstract void placement_rate();
}
class details extends std2{
	void std1() {
		String name = "pooja";
		int marks=100;
		System.out.println(name+"\n"+marks);
	}
	void placement_rate( ) {
		int eee=10;
		int cse=20;
		// percent;
		Scanner sc=new Scanner(System.in);
		int c = sc.nextInt();
		int total=eee+cse+c;
		float percent=(float)total/300;
		System.out.println(percent);
	}
}
public class std {
	public static void main (String args[]) {
		std2 s=new details();
		s.std1();
		s.placement_rate();
	}
}
