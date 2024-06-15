import java.io.*;
class file{
	public static void main(String abc[]) throws Exception{
		FileInputStream f1=new FileInputStream("abc.txt");
		int d=0,sp=0,c=0;
		while(true){
			int k=f1.read();
			if(k==-1)
			break;
			
			if(Character.isDigit(k))
			d++;
			if(k==' ')
			sp++;
			if(Character.isAlphabetic(k))
			c++;
			}
		System.out.println("Character Count="+c);
		System.out.println("Digit Count="+d);
		System.out.println("Spaces Count="+sp);
	}
}
