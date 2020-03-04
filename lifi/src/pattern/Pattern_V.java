package pattern;

public class Pattern_V {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=9;c++)
		{
			if(r==c)
			{
				System.out.print("*"+" ");
			}
			else if((r+c)==10)
			{
				System.out.print("*"+" ");
			}
			else {
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
	
}
}
