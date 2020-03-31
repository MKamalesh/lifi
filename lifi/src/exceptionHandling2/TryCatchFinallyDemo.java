package exceptionHandling2;

public class TryCatchFinallyDemo {
public static void main(String[] args) {
	int a=10,b=0;
	try {
		System.out.println(a/b);
	}catch(ArithmeticException ae)
	{
		System.out.println("please check numbers");
	}catch(Exception e)
	{
		System.out.println("check pannuppa");
	}
	finally {
		System.out.println("done");
	}
}
}
