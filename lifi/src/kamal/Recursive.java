package kamal;

public class Recursive {
	void print(int x)
	{
		System.out.println(x);
		x--;
		if(x>2)
		{
			print(x);
		}
			
		}
	
public static void main(String args[])
{
	Recursive a=new Recursive();
	a.print(5);
	System.out.println("end");
			
}
	

}
