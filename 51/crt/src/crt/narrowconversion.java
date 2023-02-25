package crt;
import java.util.Scanner;
public class narrowconversion {
public static void main(String[]args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter an integer value:");
	int i=inp.nextInt();
	char ch=(char) i;
	System.out.println("Character value of the given interger:"+ch);
}
}