package abs;

public class split_method {
	public static void main(String[]args) {
		String s=" example of the split words method";
		System.out.println("returning words:");
		for(String w:s.split("\\s",0)) {
			System.out.println(w+"\n");
		}
		//String s="example of the split words method";
		System.out.println("returning words:");
		for(String w:s.split("\\s",1)) {
			System.out.println(w+"\n");
		}
		//String s="example of the split words method";
		System.out.println("returning words:");
		for(String w:s.split("\\s",2)) {
			System.out.println(w+"\n");
		}
	}

}
