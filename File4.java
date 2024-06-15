import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String=");
		String s1=sc.next();
		int a[]=new int[100];
		int k;
		FileWriter f1=new FileWriter("abc.txt");
		for(int i=0;i<s1.length();i++){
			k=s1.charAt(i);
			a[i]=k;
		}
		for(int i=0;i<s1.length();i++){
			f1.write(a[i]);
//		System.out.print(a[i]+" ");
		}
		
		f1.close();
		System.out.println("Copy Successfully.......");
	}
}
