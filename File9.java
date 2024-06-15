import java.io.*;
import java.util.*;
import java.lang.Character;
class demo{
	public static void main(String abc[]) throws IOException{
	FileInputStream f1=new FileInputStream("sample.txt");
	FileOutputStream f2=new FileOutputStream("abc.txt");
	
	int k;
	while(true){
		k=f1.read();
		if(k==-1)
		break;
		
		if(Character.isUpperCase(k))
		{
			f2.write((k-32)+' ');
		}
		else if(Character.isLowerCase(k))
		{
			f2.write((k-32)+' ');
		}
		else if(Character.isDigit(k))
		f2.write('*');
		else
		f2.write(k+' ');
	}
	f1.close();
	f2.close();	
	System.out.println("Copy Successfully");
	}
}
