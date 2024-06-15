import java.awt.*;
import java.awt.event.*;
import java.lang.Integer;
class table extends Frame implements ActionListener{
    Label l1,l2;
    List lst;
    TextField t1;
    Button b1,b2;
    table(){
        setVisible(true);
        setTitle("Tabel");
        setSize(100,200);
        setLayout(new FlowLayout());
        l1=new Label("Enter Number");
        l2=new Label("Table");
        b1=new Button("OK");
        b2=new Button("clear");
        lst=new List(10);
        t1=new TextField(10);
        add(l1);add(t1);add(l2);add(lst);add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            int n=Integer.parseInt(t1.getText());
            for(int i=1;i<=10;i++){
                lst.add(""+i*n);
            }
        }
        if(ae.getSource()==b2){
            lst.clear();
        }
    }
}
class md{
    public static void main(String abc[]){
        table ob=new table();
    }
}
