import java.util.*;
abstract class order{
	Scanner sc = new Scanner(System.in);
	int id;
	String description;
	abstract void accept();
	abstract void disp();
}
class purchase_order extends order{
	String customername;
	void accept(){
		System.out.println("Enter the Customer Id=");
		id=sc.nextInt();
		System.out.println("Enter the Customer Description=");
		description=sc.next();
		System.out.println("Enter the Customer name=");
		customername=sc.next();
	}
	void disp(){
		System.out.println("Customer Id="+id);
		System.out.println("Customer description="+description);
		System.out.println("Customer name="+customername);
	}
}

class sales_order extends order{
	String Vendorname;
	void accept(){
		System.out.println("Enter the Vendor Id=");
		id=sc.nextInt();		
		System.out.println("Enter the Vendor Description=");
		description=sc.next();
		System.out.println("Enter the Vendor name=");
		Vendorname=sc.next();
	}
	void disp(){
		System.out.println("Vendor Id="+id);
		System.out.println("VEndor description="+description);
		System.out.println("Vendor name="+Vendorname);	
	}
}
class demo{
	public static void main(String ab[])
	{
		sales_order ob1=new sales_order();
		sales_order ob2=new sales_order();
		sales_order ob3=new sales_order();		
		purchase_order ob4=new purchase_order();
		purchase_order ob5=new purchase_order();
		purchase_order ob6=new purchase_order();
		ob1.accept();
		ob1.disp();
		ob2.accept();
		ob2.disp();
		ob3.accept();
		ob3.disp();
		
		ob4.accept();
		ob4.disp();
		ob5.accept();
		ob5.disp();
		ob6.accept();
		ob6.disp();
	}
}
