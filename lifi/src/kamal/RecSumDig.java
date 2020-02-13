package kamal;

public class RecSumDig {

	public static void main(String[] args) {
		RecSumDig a= new RecSumDig();
		a.print(5);
		System.out.println(sum);
	}
static int sum=0;
	private void print(int i) {
		sum=sum+i;
		i--;
		if(i>0)
		{
			print(i);
		}
		//System.out.println(sum);
			
		}
		// TODO Auto-generated method stub
		
	}


