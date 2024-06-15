import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the File Name=");
		String s1=sc.next();
		System.out.print("Enter the File Name to write data=");
		String s2=sc.next();
		FileInputStream f1=new FileInputStream(s1);
		FileOutputStream f2=new FileOutputStream(s2);
		while(true)
		{
			int k=f1.read();
			if(k==-1)
			break;
			
			f2.write(k);
		}
		f1.close();
		f2.close();
		System.out.println("File copy Successfully.....!");
	}
}
