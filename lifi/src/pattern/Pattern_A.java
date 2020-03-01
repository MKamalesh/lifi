package pattern;

public class Pattern_A {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(((c==1)||(c==5))&&((r==1)||(r==2)))
				{
					System.out.print(" ");
				}
				else if(((c==2)||(c==4))&&((r==1)||(r==4)||(r==5)))
				{
					System.out.print(" ");
				}
				else if((c==3)&&((r==2)||(r==4)||(r==5)))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
