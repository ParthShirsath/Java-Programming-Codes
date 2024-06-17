import java.awt.*;
class add extends Frame{
	Label l1,l2,l3,l4;
	Button b1,b2,b3;
	TextField t1,t2,t3;
	add(){
		l1=new Label("Number addtion");
        l2=new Label("Enter First Number");
        l3=new Label("Enter Second Number");
        l4=new Label("Result");
        
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        
        b1=new Button("Add");
        b2=new Button("Clear");
        b3=new Button("Exit");
        
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        
        l1.setBounds(30,50,110,50);
        add(l1);
        l2.setBounds(50,100,140,50);
        add(l2);
        l3.setBounds(50,150,140,50);
        add(l3);
        l4.setBounds(50,200,100,50);
        add(l4);
        
        t1.setBounds(210,115,220,20);
        add(t1);
        t2.setBounds(210,165,220,20);
        add(t2);
        t3.setBounds(210,215,220,20);
        add(t3);
        
        b1.setBounds(210,250,50,25);
        add(b1);
        b2.setBounds(270,250,50,25);
        add(b2);
        
        b3.setBounds(350,300,50,25);
        add(b3);
	}
}

class md{

    public static void main(String abc[]){
        add ob=new add();
    }
}
