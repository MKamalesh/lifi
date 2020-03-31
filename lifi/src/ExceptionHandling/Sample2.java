package ExceptionHandling;

public class Sample2 {
public static void main(String[] args) {
int a[]= {1,2,3};
int c=5,b=0,n=5;
try {
	System.out.println(c/b);
	System.out.println(a[n]);
}catch(ArithmeticException e)
{
	System.out.println("A");
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("B");
}


}
}
