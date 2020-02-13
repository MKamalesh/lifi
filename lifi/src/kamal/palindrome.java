package kamal;

public class palindrome {

	public static void main(String[] args) {
		int n=123,sum=0,a=0;
		int b=n;
		while(n>0)
		{
			a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		if(sum==b)
		{
			System.out.println("n is palindrome");
		}
		else {
			System.out.println("n is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
