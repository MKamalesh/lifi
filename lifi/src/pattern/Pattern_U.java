package pattern;

public class Pattern_U {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=4;c++)
		{
			if(((c==1)||(c==4))&&((r>=1)&&(r<=4)))
			{
				System.out.print("*"+" ");
			}
			else if(((c==2)||(c==3))&&(r==5))
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
