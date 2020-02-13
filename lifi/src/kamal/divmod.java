package kamal;

public class divmod {

	public static void main(String[] args) {
		int n=7589;
		int a,b,c,d;
		int sum=0;
		d=n%10;
		n=n/10;
		c=n%10;
		n=n/10;
		b=n%10;
		a=n/10;
		sum=a+b+c+d;
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
