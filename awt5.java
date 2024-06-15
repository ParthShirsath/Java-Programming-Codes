import java.awt.*;
import java.awt.event.*;
class font extends Frame{
    Choice c1,c2;
    List l1;
    Button b1;
    TextArea ta;
    font(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300,300);
        c1=new Choice();
        c1.add("karumbi regular");
        c1.add("Gigi");
        c1.add("Verdana");
        l1=new List();
        l1.add("Regular");
        l1.add("Bold");
        l1.add("Italic");
        c2=new Choice();
        for(int i=10;i<100;i++){
            c2.add(""+i);
        }
        b1=new Button("Ok");
        ta=new TextArea();
        add(c1);
        add(l1);
        add(c2);
        add(b1);
        add(ta);
    }
}
class md{
    public static void main(String abc[]){
        font ob=new font();
    }
}
