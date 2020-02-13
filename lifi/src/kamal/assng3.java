package kamal;

public class assng3 {

	public static void main(String[] args) {
		double n=11.0,t;
		double sq=n/2;
		do
		{
			t=sq;
			sq=(t+(n/t))/2;
		}while((t-sq)!=0);
		System.out.println(sq);
		
		// TODO Auto-generated method stub

	}

}
