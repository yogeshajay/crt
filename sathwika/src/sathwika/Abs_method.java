package sathwika;   
class getorset_name{
	private String name;
	public String getName() {
		return this.name;
	}
	public void setname(String name) {
		this.name=name;
	}


public static void main(String[]main) {
	getorset_name d=new getorset_name();
	d.setname("my name");
	System.out.println(d.getName());
}
	

}
