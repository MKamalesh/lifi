package listPrograms;

public class Prgm_15 {
	public static void main(String[] args) {
		int n=3,count=1;
		System.out.print("2"+" ");
		while(count<20)
		{
			int div=3;
	    	boolean check=true;
	    if(n%2!=0)
		{
	    	
		while(div<n)
		{
			if(n%div==0)
			{
				check=false;
				break;
		    }
			div+=2;
		}
			if(check==true) {
				System.out.print(n+" ");
				count++;
				
			}
			
		}
	    else {
	    	System.out.print(n+" ");
	    	count++;
	    }
	    n=n+2;
		}
}
}
