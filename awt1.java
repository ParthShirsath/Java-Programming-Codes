import java.awt.*;
import java.awt.event.*;
import java.lang.Character;
import java.lang.Integer;
class demo extends Frame implements ActionListener{
    Label l1,l2;
    Button b1,b2;
    TextField t1,t2;
    demo(){
        setVisible(true);
        setLocation(200,300);
        setTitle("Greet Message...");
        setSize(100,200);
        setLayout(new GridLayout(3,2,20,20));
        l1=new Label("Enter Your Name=");
        l2=new Label("Greet Message=");
        b1=new Button("Greet");
        b2=new Button("Exit");
        t1=new TextField(10);
        t2=new TextField(10);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String s1=t1.getText();
            String s=s1.toUpperCase();
            t2.setText("Hello "+s+" Nice To Meet you");
        }
        if(ae.getSource()==b2){
            dispose();
        }
    }
}
class mdemo{
    public static void main(String abc[]){
        demo ob=new demo();
    }
}