package abs;

public class stringbuffer_replaces {
	public static void main(String[]args)
	{
		StringBuffer str1=new StringBuffer("hello world");
		str1.replace(6,11,"java");
		System.out.println(str1);
		StringBuffer str=new StringBuffer();
		System.out.println(str.capacity());
		StringBuffer str2=new StringBuffer();
		System.out.println(str2.capacity());
		str1.ensureCapacity(30);
		System.out.println(str2.capacity());
	}
	}


