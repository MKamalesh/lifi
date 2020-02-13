package kamal;

public class test3 {

	public static void main(String[] args) {
		int x=10;
		if(x>10 && x++ < x++)
		{
			x++;
		}
		else if(x++ >10 || x++ < x++)
		{
			x--;// TODO Auto-generated method stub
		}
		else {
			x++;
		}
		System.out.println(x);

	}

}
