package abstraction;

abstract class Car {
	abstract void accelerate();
}
//concrete class
class suzuki extends Car
{
	void accelerate(){
		System.out.println("suzuki::accelerate");
	}
}

public class Cars {
	
	public static void main(String[] args) {
		Car obj = new suzuki();    //car object=>content
		obj.accelerate();          //call the method
	}
}
