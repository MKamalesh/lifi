package ExceptionHandling;

public class Sample3 {
	public static void main(String[] args) {
		int k[]= {1,2,3};
		int c=-1,a=15,b=2;
		try {
			c=a/b;
			System.out.println("A="+k[c]);
		}catch(ArithmeticException t)
		{
			System.out.println("B="+c);
		}catch(ArrayIndexOutOfBoundsException s)
		{
			try {
			System.out.println(k[a]);
			}catch(ArrayIndexOutOfBoundsException d)
			{
			System.out.println("hello");	
			}
		}
	}

}
