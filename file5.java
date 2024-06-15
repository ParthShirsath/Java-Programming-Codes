import java.io.File;
import java.lang.Character;
class fll{
	public static void main(String abc[]) throws Exception{
		File f1=new File("Documents");
		if(f1.isDirectory())
		{
			String s1[]=f1.list();
			for(int i=0;i<s1.length;i++)
			{
				String fname=s1[i];
				if(fname.endsWith(".odt"))
				System.out.println(fname);
			}
		}
	}
}
