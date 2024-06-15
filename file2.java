import java.io.*;
import java.lang.Character;
class file{
	public static void main(String abc[]) throws Exception{
		FileReader f1=new FileReader("abc.txt");
		BufferedReader bf=new BufferedReader(f1);
		String s1="";
		int word=0,line=0;
		
		while((s1=bf.readLine())!=null){
			String s2[]=s1.split(" ");
			line++;
			for(int i=0;i<s2.length;i++)
			{
				word++;
			}
		}
		System.out.println("Number of Word="+word);
		System.out.println("Number of Line="+line);
		
		FileInputStream f3=new FileInputStream("abc.txt");
		int ch=0;
		int i;
		while(true){
			i=f3.read();
			if(i==-1)
			break;
			ch++;
		}
		System.out.println("Number of character="+(ch-1));
		
		f1.close();
		bf.close();
		}
}
