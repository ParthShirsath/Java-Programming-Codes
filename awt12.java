import java.awt.*;
class covid extends Frame{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Choice ch1,ch2;
	TextField t1,t2;
	CheckboxGroup chg1,chg2,chg3;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	Button b1;
	covid(){
	
		setVisible(true);
		setSize(800,600);
		setLayout(null);
		setBackground(Color.gray);
		l1=new Label("Co-WIN Registration");
		l2=new Label("Addhar Number");
        l3=new Label("Birth Year");
        l4=new Label("Mobile No");
		l5=new Label("Age Group");
        l6=new Label("Select Hospital");
        l7=new Label("Vaccines");
		l8=new Label("Time slot");

		b1=new Button("Submit");
		
		chg1=new CheckboxGroup();
		chg2=new CheckboxGroup();
		chg3=new CheckboxGroup();
		
		c1=new Checkbox("18 & Above",chg1,true);
		c2=new Checkbox("45 & Above",chg1,false);
		
		c3=new Checkbox("Morning",chg3,true);
		c4=new Checkbox("Afternoon",chg3,false);
		c5=new Checkbox("Evening",chg3,false);
		
		c6=new Checkbox("Covishield",chg2,true);
		c7=new Checkbox("Covaxin",chg2,false);
		c8=new Checkbox("Sputnik V",chg2,false);
		
		ch1=new Choice();
		for(int y=2025;y>=1900;y--)
		ch1.add(""+y);

		ch2=new Choice();
		ch2.add("City Hospital");
		ch2.add("Aims");
		ch2.add("Morge Hospital");
		
		t1=new TextField(10);
		t2=new TextField(10);
		
		Font f=new Font("MonoSpaced",Font.BOLD,20);
		l1.setFont(f);
		l1.setBounds(280,50,500,20);
		add(l1);
		
		
		Font f1=new Font("MonoSpaced",Font.ITALIC,15);
		l2.setFont(f1);
		l2.setBounds(50,100,150,20);
		add(l2);
		
		l3.setFont(f1);
		l3.setBounds(50,150,150,20);
		add(l3);

		
		l4.setFont(f1);
		l4.setBounds(50,200,150,20);
		add(l4);
		
		l5.setFont(f1);
		l5.setBounds(50,250,150,20);
		add(l5);
		
		l6.setFont(f1);
		l6.setBounds(50,300,150,20);
		add(l6);
		
		l7.setFont(f1);
		l7.setBounds(50,350,150,20);
		add(l7);
		
		l8.setFont(f1);
		l8.setBounds(50,400,150,20);
		add(l8);
		
		t1.setBounds(230,100,300,20);
		add(t1);
		
		t2.setBounds(230,200,300,20);
		add(t2);
		
		ch1.setBounds(230,150,200,20);
		ch1.setBackground(Color.white);
		add(ch1);
		
		ch2.setBounds(230,300,200,20);
		ch2.setBackground(Color.white);
		add(ch2);
		
		c1.setBounds(230,250,150,20);
		add(c1);
		c2.setBounds(390,250,150,20);
		add(c2);
		
		c3.setBounds(230,400,150,20);
		add(c3);
		c4.setBounds(390,400,150,20);
		add(c4);
		c5.setBounds(550,400,150,20);
		add(c5);
		
		
		c6.setBounds(230,350,150,20);
		add(c6);
		c7.setBounds(390,350,150,20);
		add(c7);
		c8.setBounds(550,350,150,20);
		add(c8);
		
		b1.setBounds(300,450,150,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		add(b1);
	}
}
class md{

    public static void main(String abc[]){
        new covid();
    }
}
