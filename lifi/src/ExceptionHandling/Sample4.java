package ExceptionHandling;

public class Sample4 {
public static void main(String[] args) {
	int x[]= {};
	int a=5,b=0;
	try {
		System.out.println(x[a/b]);
	}catch(ArithmeticException c)
	{
		System.out.println("b");
	}
		catch(Exception e)
	{
		System.out.println(a);
	}
	
}
}
