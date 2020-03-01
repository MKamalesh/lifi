package pattern;

public class Pattern_K {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=3;c++)
		{
			if((c==2)&&((r==1)||(r==3)||(r==5)))
			{
				System.out.print(" "+" ");
			}
			else if((c==3)&&((r==2)||(r==3)||(r==4)))
			{
				System.out.print(" "+" ");
			}
			else {
				System.out.print("*"+" ");
			}
		}
		System.out.println();
	}
}
}
