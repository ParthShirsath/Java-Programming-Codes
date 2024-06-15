import java.awt.*;
import java.awt.event.*;
class colour extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    colour(){
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(100,200);
        setTitle("Colour");
        b1=new Button("Orenge");
        b2=new Button("Red");
        b3=new Button("Pink");
        b4=new Button("Yellow");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            setBackground(Color.orange);
        }
        if(ae.getSource()==b2)
        {
            setBackground(Color.red);
        }
        if(ae.getSource()==b3)
        {
            setBackground(Color.pink);
        }
        if(ae.getSource()==b4)
        {
            setBackground(Color.yellow);
        }
    }
}
class demo{
    public static void main(String abc[]){
        colour ob=new colour();
    }
}