package listPrograms;

public class Prgm_12 {
	public static void main(String[] args) {
		int n;
		for( n=1;n<=100;n++)
		{
			if(n%3==0 || n%5==0)
			{
				System.out.print(n+" ");
			}
		}
	}

}
