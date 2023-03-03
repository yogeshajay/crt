package kk;

public class single_runable implements Runnable {
public static void main(String[]args) {
	Thread th1=new Thread(new single_runable());
			Thread th2=new Thread(new single_runable());
			th1.start();
			th2.start();
}
public void run() {
	System.out.println("Executing Task");
}
}
