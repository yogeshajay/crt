package sathwika;

public class private_modifier {
public static void main(String[]args) {
	getorset_name d=new getorset_name();
	d.setname("MY NAME IS YOGESH");
	System.out.println(d.getName());
}
}
class grtorset_name{
	private String name;
	public String getName() {
		return this.name;
	}
		
	
}