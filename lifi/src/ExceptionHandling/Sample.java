package ExceptionHandling;

public class Sample {
public static void main(String[] args) {
	int a=5,b=0;
	try {
		System.out.println(a/b);
	}catch(ArithmeticException e)
	{
		System.out.println("iuyt");
	}
	System.out.println("end");
	
}
}
