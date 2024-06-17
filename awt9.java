import java.awt.*;
import java.awt.event.*;
class string extends Frame implements ActionListener{
	Label l1,l2;
	Button b1;
	TextField t1;
	TextArea ta;
	string(){
		l1=new Label("Enter The String");
        l2=new Label("Result String");
        t1=new TextField(10);
        ta=new TextArea();
        b1=new Button("Ok");
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        
        l1.setBounds(50,40,120,50);
        add(l1);
        l2.setBounds(50,90,120,50);
        add(l2);
        
        t1.setBounds(180,55,200,20);
        add(t1);
        
        ta.setBounds(180,105,250,100);
        add(ta);
        
        b1.setBounds(180,220,70,20);
        add(b1);
        
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==b1){
    		String s1=t1.getText();
    		String s2[]=s1.split(" ");
    		for(int i=0;i<s2.length;i++){
    			ta.append(s2[i]+"\n");
    		}
    	}
    }
}

class md{

    public static void main(String abc[]){
        string ob=new string();
    }
}
