import java.awt.*;
import java.lang.Integer;
import java.awt.event.*;
class product extends Frame implements ActionListener{
    Label l1,l2;
    Button b1,b2,b3;
    TextField t1;
    List lst;
    product(){
        setVisible(true);
        setSize(300,300);
        setTitle("Product Demo");
        setLayout(new FlowLayout());
        l1=new Label("Enter Product::");
        l2=new Label("All Product::");
        b1=new Button("Add");
        b2=new Button("Remove");
        b3=new Button("Remove All");
        t1=new TextField(10);
        lst=new List(10);
        add(l1);
        add(t1);
        add(l2);
        add(lst);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            String p1=t1.getText();
            lst.add(p1);
        }
        if(ae.getSource()==b2)
        {
            lst.remove(lst.getSelectedItem());
        }
        if(ae.getSource()==b3){
            lst.clear();
        }
    }
}
class md{
    public static void main(String abc[]){
        product ob=new product();
    }
}
