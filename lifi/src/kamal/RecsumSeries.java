package kamal;

public class RecsumSeries {

	public static void main(String[] args) {
		RecsumSeries rec=new RecsumSeries();
		rec.series();
		System.out.println(sum);
		// TODO Auto-generated method stub

	}
	int a=1;
	static int sum=0;

	private void series() {
		sum=sum+a;
		a++;
		if(a<=5)
		{
			series();
		}
		
		// TODO Auto-generated method stub
		
	}

}
