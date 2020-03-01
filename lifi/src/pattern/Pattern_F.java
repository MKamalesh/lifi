package pattern;

public class Pattern_F {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=3;c++)
		{
			if(((c==2)||(c==3))&&((r==2)||(r==4)||(r==5)))
			{
				System.out.print(" ");
			}
			else {
				System.out.print("*"+" ");
			}
		}
		System.out.println();
	}
}
}
