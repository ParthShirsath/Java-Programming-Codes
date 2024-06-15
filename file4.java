import java.io.File;
import java.lang.Character;
class fll{
	public static void main(String abc[]) throws Exception{
		File f1=new File("file4.java");
		System.out.println("File name="+f1.getName());
		System.out.println("Parent File name="+f1.getParent());
		System.out.println("File Full path="+f1.getAbsolutePath());
		System.out.println("File Length="+f1.length());
	}
}
