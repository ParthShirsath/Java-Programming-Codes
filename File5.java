import java.io.*;
import java.util.*;
class demo{
	public static void main(String abc[]) throws IOException{
		FileReader f1=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(f1);
		String s1="";
		while((s1=br.readLine())!=null){
			System.out.println(s1);
		}
		f1.close();
	}
}
