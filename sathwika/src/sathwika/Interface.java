package sathwika;
interface bnk{
	float rateOfInterest();
}
class SBI implements bnk{
	public float rateOfInterest() {return 9.15f;}
	}
class PNB implements bnk{
	public float rateOfInterest() {return 9.7f;}
	}
public class Interface {
	public static void main (String[] args) {
		bnk b=new SBI();
		System.out.println("ROI: "+b.rateOfInterest()+ "%");
	}}
