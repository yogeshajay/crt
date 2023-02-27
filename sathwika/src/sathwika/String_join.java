package sathwika;

public class String_join {
public static void main(String[] args) {
	String date = String.join("/", "25","10","2018");
	System.out.println(date);
	String time = String.join(":", "12","10","10");
	System.out.println(time);
	String str = null;
	str= String.join("-", null, "comefast","to","the college","class is waiting","for you");
	System.out.print(str);
}
}
