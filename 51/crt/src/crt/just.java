package crt;

import java.util.Scanner;

public class just {

	public static void main(String[] args) {
		String name;
		char a;
		int sub1,sub2,sub3;
		System.out.println("enter your name:");
		Scanner f= new Scanner (System.in);
		name= f.nextLine();
		System.out.println("enter your initial:");
		Scanner k= new Scanner (System.in);
		a=k.next().charAt(0);
		System.out.println("enter sub1 marks:");
		Scanner s1= new Scanner (System.in);
		sub1 =s1.nextInt();
		System.out.println("enter sub2 marks:");
		Scanner s2= new Scanner (System.in);
		sub2 =s2.nextInt();
		System.out.println("enter sub3 marks:");
		Scanner s3= new Scanner (System.in);
		sub3 =s3.nextInt();
		int total=sub1+sub2+sub3;
		float percent =(float)total/300*100;
		System.out.println("\n"+intial+"\n"+roll_name"\n");
	}
}
