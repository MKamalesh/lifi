package kamal;

public class Diagonal {

	public static void main(String[] args) {
	int n=1;
	for(int r=0;r<=4;r++)
	{
		for(int c=0;c<=4;c++)
		{
			if(r==c)
			{
				System.out.print(n);
			}
			else {
				System.out.print(" ");
			}
	    }
		System.out.println();
		n++;
	}
		// TODO Auto-generated method stub

	}

}
