import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws IOException{
	Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter Source File");
		String s1=sc.next();
		System.out.print("Enter Destination File");
		String s2=sc.next();
		FileReader f1=new FileReader(s1);
		FileWriter f2=new FileWriter(s2);
		
		BufferedReader bf1=new BufferedReader(f1);
		BufferedWriter bf2=new BufferedWriter(f2);
		
		String s3="";
		while((s3=bf1.readLine())!=null){
			bf2.write(s3+"\n");
		}
		bf2.write("Comment:End of file");
		System.out.print("Copy Successfully...");
		bf1.close();
		bf2.close();
		f1.close();
		f2.close();
	}
}
