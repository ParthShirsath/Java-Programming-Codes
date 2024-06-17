import java.awt.*;
import java.util.*;
import java.awt.event.*;

class InequalUP extends Exception{
	public String toString(){
		return "Username and Password are not equal";
	}
}

class form extends Frame implements ActionListener{
	Label l1,l2,l3,l4,l5;
	Button b1,b2;
	TextField t1,t2,t3,t4,t5;
	int cnt=1;
	form(){
		setVisible(true);
		setSize(600,370);
		setLayout(null);
		
		l1=new Label("Registration form");
		l2=new Label("Enter The Username");
		l3=new Label("Enter The Password");
		l4=new Label("Result");
		
		b1=new Button("Login");
        b2=new Button("Exit");
        
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        
        l1.setBounds(200,50,210,20);
        Font f=new Font("MonoSpaced",Font.BOLD,20);
        l1.setBackground(Color.red);
        l1.setFont(f);
        add(l1);
        
        l2.setBounds(70,100,170,20);
        Font f1=new Font("Calibari",Font.ITALIC,15);
        l2.setFont(f1);
        add(l2);
        
        l3.setBounds(70,150,170,20);
        l3.setFont(f1);
        add(l3);
        
        l4.setBounds(70,200,150,20);
        l4.setFont(f1);
        add(l4);
        
        t1.setBounds(260,100,270,20);
        add(t1);
        t2.setBounds(260,150,270,20);
        t2.setEchoChar('*');
        add(t2);
        t3.setBounds(260,200,270,20);
        add(t3);
        
        b1.setBounds(260,230,100,20);;
        add(b1);
        b2.setBounds(380,230,100,20);;
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
    	if(ae.getSource()==b1){
    	String s1=t1.getText();
    	String s2=t2.getText();
    	try{
    		if(!s1.equals(s2)){
    		cnt++;
    		if(cnt==4){
    			b1.setVisible(false);
    		}
    		throw new InequalUP();
    		}
    		else
    		t3.setText("Login Successfully...");
    		}
    	catch(InequalUP e){
    		t3.setText(""+e);
    		}
    	}
    	if(ae.getSource()==b2){
    		dispose();
    	}
    }
}

class md{

    public static void main(String abc[]){
        new form();
    }
}
