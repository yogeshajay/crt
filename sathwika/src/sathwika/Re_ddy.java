package sathwika;
import java.util.*;
public class Re_ddy {
public static void main(String args[]) {
	byte b=10;
	short s=20;
	int i=30;
	long l=40;
	float f=50.0f;
	double d=60.0d;
	char c='a';
	boolean b2=true;
	
	byte byteobj=b;
	short shortobj=s;
	int intobj=i;
	long longobj=l;
	float floatobj=f;
	double doubleobj=d;
	char charobj=c;
	boolean booleanobj=b2;
	
	System.out.println("---printing object values---");
	System.out.println("byte object: "+byteobj);
	System.out.println("short object: "+shortobj);
	System.out.println("int object: "+intobj);
	System.out.println("long object: "+longobj);
	System.out.println("float object: "+floatobj);
	System.out.println("double object: "+doubleobj);
	System.out.println("char object: "+charobj);
	System.out.println("boolean object: "+booleanobj);
	
	byte bytevalue=byteobj;
	short shortvalue=shortobj;
	int intvalue=intobj;
	long longvalue=longobj;
	float floatvalue=floatobj;
	double doublevalue=doubleobj;
	char charvalue=charobj;
	boolean booleanvalue=booleanobj;
	
	System.out.println("---printing primitive values---");
	System.out.println("byte value :"+bytevalue);
	System.out.println("short value :"+shortvalue);
	System.out.println("int value :"+intvalue);
	System.out.println("long value :"+longvalue); 
	System.out.println("float value :"+floatvalue);
	System.out.println("double value :"+doublevalue);
	System.out.println("char value :"+charvalue);
	System.out.println("boolean value :"+booleanvalue);
	
}
}