package kamal;

public class bingbang {

	public static void main(String[] args) {
		int n=17;
		if(n%3==0 && n%5==0)
		{
			System.out.println("bing bang");
		}
		else if(n%3==0)
		{
			System.out.println("bang");
		}
		else if(n%5==0)
		{
			System.out.println("bing");
		}
		else
		{
			System.out.println(n);
		}
		
		// TODO Auto-generated method stub

	}

}
