package listPrograms;

public class Prgm_22 {
public static void main(String[] args) {
	int a=0,b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=2;i<10;i++)
	{
	b=a+b;                      //without usind 3rd variables
	System.out.print(b+" ");
	a=b-a;
	}
}
}
