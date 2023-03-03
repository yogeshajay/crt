package kk;
class Task1 extends Thread{
	public void run() {
		System.out.println("Executing Task 1");
	}
}
class Task2 extends Thread{
	public void run() {
		System.out.println("Executing Task 2");
	}
}

public class multtask_by_multhr {
public static void main(String[]args) {
	Task1 t1=new Task1();
	Task2 t2=new Task2();
	t1.start();
	t2.start();
}
}
