package kk;

public class single_multi extends Thread {
public void run() {
	System.out.println("Executing Task");
}
public static void main(String[]args) {
	single_multi t1=new single_multi();
	single_multi t2=new single_multi();
	single_multi t3=new single_multi();
	t1.start();
	t2.start();
	t3.start();
	
}
}
