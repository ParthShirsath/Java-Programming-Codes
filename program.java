package series;
public class program{
	public void fibonacci(int n){
		int f=0,s=1,t;
		
		System.out.print("Fibonacci Series=");
		System.out.print(f+"  "+s+"  ");
		for(int i=0;i<=n;i++){
			t=f+s;
			System.out.print(t+"  ");
			f=s;
			s=t;
		}
	}
	public void square(int n){
		System.out.print("\nSquares Series=");
		for(int i=1;i<=n;i++){
			System.out.print((i*i)+"  ");
		}
	}
	public void cube(int n){
		System.out.print("\ncubes Series=");
		for(int i=1;i<=n;i++){
			System.out.print((i*i*i)+"  ");
		}
	}
}
