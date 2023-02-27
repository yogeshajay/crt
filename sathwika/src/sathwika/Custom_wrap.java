package sathwika;
class cwrap{
	private int p;
	cwrap(){}
	cwrap(int p) {
		this.p=p;
	}
public int getvalue() {
	return p;
}
public void setvalue(int p) {
	this.p=p;
}
public String toString() {
	return Integer.toString(p);
}
}
public class Custom_wrap {
public static void main (String[] args) {
	cwrap j=new cwrap(10);
	System.out.println(j);
}
}
         