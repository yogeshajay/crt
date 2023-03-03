package kk;
class simpletask1 implements Runnable{
	public void run() {
	System.out.println("Execting Task 1");
}
}
class simpletask2 implements Runnable{
	public void run() {
	System.out.println("Execting Task 2");
}
}

public class runable_interface {
	public static void main(String[]args) {
		Thread t1=new Thread( new simpletask1());
		Thread t2=new Thread(new simpletask2());
		t1.start();
		t2.start();
	}
	
		
	}


