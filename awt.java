import java.awt.*;
import java.awt.event.*;
class demo extends Frame{
	demo(){
		setVisible(true);
		setSize(500,300);
		setLayout(new FlowLayout());
		Label l1=new Label("Hello World");
		add(l1);
	}
}
class Md{
	public static void main(String abc[]){
		demo on=new demo();
	}
}
