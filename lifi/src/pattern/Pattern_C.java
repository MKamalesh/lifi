package pattern;

public class Pattern_C {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=3;c++)
		{
			if(((r==1)||(r==5))&&(c==1))
			{
				System.out.print(" ");
			}
			else if(((r==2)||(r==3)||(r==4))&&((c==2)||(c==3)))
			{
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
