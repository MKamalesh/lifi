package kamal;

public class sumdigloop {

	public static void main(String[] args) {
		int n=156,sum=0;
		for(int i=n;n>0; )
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
