import java.awt.*;
import java.awt.event.*;
class form extends Frame {
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Button b1,b2;
	TextField t1,t2;
	Choice c1,c2;
	TextArea ta;
	Checkbox ch1,ch2,ch3,ch4,ch5,ch6;
	CheckboxGroup chg;
	form(){
		setVisible(true);
		setSize(700,600);
		setLayout(null);
		setBackground(Color.gray);
		l1=new Label("Registration Form");
        l2=new Label("Candidate Full Name");
        l3=new Label("Father Full Name");
		l4=new Label("Age");
        l5=new Label("Gender");
        l6=new Label("Course");
		l7=new Label("Hobbies");
		l8=new Label("Address");
		
		
		b1=new Button("Save Details");
        b2=new Button("Clear All");
        
        t1=new TextField(10);
        t2=new TextField(10);
        
        chg=new CheckboxGroup();
        
        ch1=new Checkbox("Male",chg,true);
        ch2=new Checkbox("Female",chg,false);
        
        ch3=new Checkbox("Drawing");
        ch4=new Checkbox("Singing");
        ch5=new Checkbox("Music");
        ch6=new Checkbox("Others");
        
        c1=new Choice();
        c1.add("Java");
        c1.add("Php");
        c1.add("Python");
        c1.add("TCS");
        c1.add("C++");
        c2=new Choice();
        for(int i=1;i<101;i++)
        {
        c2.add(""+i);
        }
        
        ta=new TextArea();
        
        
        Font f=new Font("MonoSpaced",Font.BOLD,20);
        l1.setFont(f);
        l1.setBounds(50,50,220,20);
        l1.setForeground(Color.yellow);
        add(l1);
        
        
        Font f1=new Font("Calibari",Font.ITALIC,12);
        l2.setForeground(Color.white);
        l2.setFont(f1);
        l2.setBounds(50,100,150,20);
        add(l2);
        
        l3.setForeground(Color.white);
        l3.setFont(f1);
        l3.setBounds(50,150,160,20);
        add(l3);
        
        l4.setForeground(Color.white);
        l4.setFont(f1);
        l4.setBounds(50,200,30,20);
		add(l4);
		
        l5.setForeground(Color.white);
        l5.setFont(f1);
        l5.setBounds(50,250,50,20);
        add(l5);
        
        l6.setForeground(Color.white);
        l6.setFont(f1);
        l6.setBounds(50,300,50,20);
        add(l6);
        
        l7.setForeground(Color.white);
        l7.setFont(f1);
        l7.setBounds(50,350,60,20);
        add(l7);
        
        l8.setForeground(Color.white);
        l8.setFont(f1);
        l8.setBounds(50,400,50,20);
        add(l8);
        
        t1.setBounds(210,100,300,20);
        add(t1);
        
        t2.setBounds(210,150,300,20);
        add(t2);
        
        c2.setBounds(210,200,200,20);
        c2.setBackground(Color.white);
        add(c2);
        
        ch1.setBounds(210,250,70,20);
        ch1.setBackground(Color.white);
        add(ch1);
        ch2.setBounds(290,250,100,20);
        ch2.setBackground(Color.white);
        add(ch2);
        
        c1.setBounds(210,300,300,20);
        c1.setBackground(Color.white);
        add(c1);
        
        ch3.setBounds(210,350,100,20);
        ch3.setBackground(Color.white);
        add(ch3);
        
        ch4.setBounds(320,350,100,20);
        ch4.setBackground(Color.white);
        add(ch4);
        
        ch5.setBounds(430,350,100,20);
        ch5.setBackground(Color.white);
        add(ch5);
        
        ch6.setBounds(540,350,100,20);
        ch6.setBackground(Color.white);
        add(ch6);
        
        ta.setBounds(210,400,300,100);
        ta.setBackground(Color.white);
        add(ta);
        
        b1.setBounds(210,510,120,20);
        b1.setBackground(Color.blue);
        add(b1);
        
        b2.setBounds(340,510,120,20);
        b2.setBackground(Color.red);
        add(b2);
    }
}

class md{

    public static void main(String abc[]){
        form ob=new form();
    }
}
