 package sathwika;
import java.util.Scanner;
abstract class bld {
	abstract void dimensions();
}
class SHomes extends bld{
	void dimensions() {
		int length;
		byte breadth;
		System.out.print(" enter SHomes::dimensions length");
		Scanner l = new Scanner(System.in);
		length = l.nextInt();
		System.out.print(" enter SHomes::dimensions breadth");
		Scanner b = new Scanner(System.in);
		breadth = b.nextByte();
	}
}
class reddy{
	public static void main(String args[]) {
		bld dim = new SHomes();
		dim.dimensions(); 
	}
}
