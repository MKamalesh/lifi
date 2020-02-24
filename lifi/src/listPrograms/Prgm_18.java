package listPrograms;

public class Prgm_18 {

	public static void main(String[] args) {
		int n=5;
		while(n>0)
		{
			int fact=1,i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
			}
			System.out.println(fact);
			n--;
		}
		// TODO Auto-generated method stub

	}

}
