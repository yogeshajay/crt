package abs;
abstract class Shapes{  
abstract void draw();  
}  

class Rectangle extends Shapes{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shapes{  
void draw(){System.out.println("drawing circle");}  
}  

public class drawing{  
public static void main(String args[]){  
Shapes s=new Circle1();
s.draw();  
}  
}  


