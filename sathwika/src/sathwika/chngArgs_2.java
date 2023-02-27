package sathwika;
class Adder_2{
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}
}
public class chngArgs_2 {
public static void main(String[]args) {
	System.out.println(Adder_2.add(11,11));
	System.out.println(Adder_2.add(12.3,12.6));
}
}
