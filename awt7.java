import java.awt.*;
class screen extends Frame{
    Label l1,l2,l3,l4,l5,l6;
    Button b1,b2,b3;
    TextField t1,t2,t3,t4,t5;
    screen(){
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        l1=new Label("Compound Intrest Calculater");
        l2=new Label("Principle Amount");
        l3=new Label("Intrest Rate(%)");
        l4=new Label("Time(Yrs)");
        l5=new Label("Total Amount");
        l6=new Label("Intrest Amount");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);
        b1=new Button("Calculate");
        b2=new Button("Clear");
        b3=new Button("Close");
        l1.setBounds(150,50,200,50);
        add(l1);
        l2.setBounds(40,100,100,50);
        add(l2);
        l3.setBounds(40,150,100,50);
        add(l3);
        l4.setBounds(260,150,100,50);
        add(l4);
        l5.setBounds(40,200,100,50);
        add(l5);
        l6.setBounds(40,250,100,50);
        add(l6);
        b1.setBounds(50,300,100,20);
        add(b1);
        b2.setBounds(170,300,100,20);
        add(b2);
        b3.setBounds(290,300,100,20);
        add(b3);
        t1.setBounds(150,115,130,20);
        add(t1);
        t2.setBounds(360,165,70,20);
        add(t2);
        t3.setBounds(150,165,100,20);
        add(t3);
        t4.setBounds(150,215,100,20);
        add(t4);
        t5.setBounds(150,265,100,20);
        add(t5);
    }
}
class md{

    public static void main(String abc[]){
        screen ob=new screen();
    }
}
