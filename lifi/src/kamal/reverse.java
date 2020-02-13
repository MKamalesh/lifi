package kamal;

public class reverse {

	public static void main(String[] args) {
		int n=563,a;
		int sum=0;
		for( ;n>0; )
		{
			a=n%10;
			sum=sum*10+a;
			n=n/10;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
