import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws IOException{
		FileReader f1=new FileReader("sample.txt");
		BufferedReader bf=new BufferedReader(f1);
		String s1="";
		while((s1=bf.readLine())!=null){
			StringBuffer sbr=new StringBuffer(s1);
			sbr.reverse();
			System.out.println(sbr+" ");
		}
		f1.close();
		bf.close();
	FileInputStream f3=new FileInputStream("sample.txt");
	FileOutputStream f4=new FileOutputStream("abc.txt");
	
	int k;
	while(true){
		k=f3.read();
		if(k==-1)
		break;
		
		if(k>='A' && k<='Z')
		{
			f4.write(k+32);
		}
		if(k>='a' && k<='z')
		{
			f4.write(k-32);
		}
	}
	f3.close();
	f4.close();	
	System.out.println("Copy Successfully");
	}
}
