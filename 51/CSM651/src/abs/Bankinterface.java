package abs;
interface bnk{
	float rateofInterest();
}
class IOB implements bnk{
	public float rateofInterest() 
	{
		return 9.15f;
				}
}
	class SBH implements bnk{
		public float rateofInterest()
		{
			return 9.7f;
		}
	}
		public class Bankinterface {
			public static void main(String[]args) {
				bnk b=new SBH();
				System.out.println("ROI:"+b.rateofInterest()+"%");
				bnk c=new IOB();
				System.out.println("ROI:"+c.rateofInterest()+"%");
			}
		}
	

