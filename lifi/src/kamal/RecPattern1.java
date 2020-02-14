package kamal;

public class RecPattern1 {

	public static void main(String[] args) {
		RecPattern1 rp=new RecPattern1();
		rp.pattern(1);
		// TODO Auto-generated method stub

	}
	private int pattern(int i) {
		if(i>9)
		{
			return 1;
		}
		if(i%3==1)
		{
			System.out.println();
		}
		System.out.print(i+" ");
		int j=pattern(i+1);
		return j;
	
		
		// TODO Auto-generated method stub
		
	}

}
