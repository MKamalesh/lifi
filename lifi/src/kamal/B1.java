package kamal;

public class B1 extends A1 {
	int a=20;
	void sub()
	{
		System.out.println(a);
		System.out.println(super.a);//super-to print variable in A1
		
	}
	B1(int a)
	{
		System.out.println("B");
	}

}
