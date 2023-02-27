package sathwika;
class Adder{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class chngArgs {
public static void main(String[]args) {
	System.out.println(Adder.add(1,11));
	System.out.println(Adder.add(1,11,111));
}
}
