package kamal;

public class maths {

	public static void main(String[] args) {
		maths fibo=new maths();
		int a=fibo.SumOfFibo(5);
		int b=fibo.SumOfFibo(10);
		int c=fibo.SumOfFibo(12);
		System.out.println("sum of fibonacci"+" "+a);
		System.out.println("sum of fibonacci"+" "+b);
		System.out.println("sum of fibonacci"+" "+c);
		maths fact=new maths();
		int r=fact.factorial(5);
		System.out.println("factorial is"+" "+r);
		maths sdig=new maths();
		int r1=sdig.sumOfDigits(555);
		System.out.println("sum of digits"+" "+r1);
		maths series=new maths();
		int r2=series.sumOfSeries(6);
		System.out.println("sum of Series is"+" "+r2);
		maths rev=new maths();
		int r3=rev.reverse(345);
		System.out.println("reverse is"+" "+r3);
		maths chara=new maths();
	char r4=	chara.character('B');
	System.out.println("to lower character is:"+" "+r4);
	maths charac=new maths();
	char r5=charac.lower('c');
	System.out.println("upper case:"+r5);
	}
    private char lower(char c) {
		char a;
		a=(char)(c-32);
		return a;
	}
    private char character(char c) {
	char a;
	a=(char)(c+32);
		return a;
	}
		// TODO Auto-generated method stub
	private int reverse(int i) {
		int a;
		int sum=0;
		for( ;i>0; )
		{
			a=i%10;
			sum=sum*10+a;
			i=i/10;
		}
		return sum;
		// TODO Auto-generated method stub
}
   private int sumOfSeries(int i) {
		int j,sum=0;
		for(j=1;j<=i;j++)
		{
			sum=sum+j;
		}
		return sum;
		// TODO Auto-generated method stub
}
   private int sumOfDigits(int i) {
		int sum=0,r,j;
		for(j=0;i>0;j++)
		{
			r=i%10;
			sum=sum+r;
			i=i/10;
		}
		return sum;
		// TODO Auto-generated method stub
		
	}

	private int factorial(int i) {
		int f=1,j=1;
		while(j<=i)
		{
		f=f*j;
		j++;
		}
		// TODO Auto-generated method stub
		return f;
	}

	private int SumOfFibo(int i) {
		int d=0,e=1;
		int sum=d+e;
		int j=2;
		while(j<i)
		{
			int f=d+e;
			sum=sum+f;
			d=e;
			e=f;
			j++;
		}
		return sum;
		// TODO Auto-generated method stub
		
	}

}
