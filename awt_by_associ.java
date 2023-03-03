package kk;
import java.awt.*;
public class awt_by_associ 
{
	 awt_by_associ(){
		 Frame f=new Frame();
		 Label l=new Label("Employee ID:");
		 Button b=new Button("Submit");
		 TextField t=new TextField();
		 l.setBounds(40,1000,1000,40);
		 t.setBounds(20,100,80,30);
		 b.setBounds(100,100,80,30);
		f.add(b);
		f.add(l);
		f.add(t);
		f.setSize(400,300);
		f.setTitle("Employee Info");
		f.setLayout(null);
		f.setVisible(true);
	}
	 public static void main(String[]args){
		 awt_by_associ a=new  awt_by_associ(); 
	 }

}
