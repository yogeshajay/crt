package sathwika;

public class Str_comparison {
public static void main(String[] args) {
	String s1 = "apple";
	String s2 = "grapes";
	int len1 = s1.length();
	int len2 = s2.length();
	if(len1 == len2) {
		System.out.println("equal"+len1);
	}
	else {
		System.out.println("not equal" +"\n" +len2);
	}
}
}
