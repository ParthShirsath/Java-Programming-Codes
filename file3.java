import java.io.*;
import java.lang.Character;
class file{
	public static void main(String abc[]) throws Exception{
		FileInputStream f1=new FileInputStream(abc[0]);
		FileOutputStream f2=new FileOutputStream(abc[1]);
		
		while(true){
			int i=f1.read();
			if(i==-1)
			break;
			
			f2.write(i);
		}
		System.out.println("Copy Successfully...");
}
}
