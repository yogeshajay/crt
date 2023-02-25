package abs;
import java.util.*;
public class swi_enum {
enum course
{
	AI,ML,WD
}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	course[] presentcourse=course.values();
	for(course c:presentcourse)
	{
		switch(c)
		{
		case AI:
			System.out.println("the full form of AI is artificial");
			break;
		case ML:
			System.out.println("the full form of ML is machine learning");
			break;
		case WD:
			System.out.println("the full form of WD is web");
			break;
		}
	}
}
}
