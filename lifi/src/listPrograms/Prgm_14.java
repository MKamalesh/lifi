package listPrograms;

public class Prgm_14 {
	public static void main(String[] args) {
		int n=123456,div=3;
		if(n==2)
		{
			System.out.println("prime");
			
		}
		else if(n%2!=0)
		{
		while(div<=n)
		{
			if(n%div==0)
			{
				System.out.println("not prime");
				div=div+2;
				break;
		    }
			else {
				System.out.println("prime");
				break;
			}
			
		}
	}
		else {
			System.out.println("not prime");
		}

}
}
