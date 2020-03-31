package ExceptionHandling;

public class MultiCatchThrowThrows {
public static void main(String[] args) {
	MultiCatchThrowThrows M=new MultiCatchThrowThrows();
	try {
		M.work();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("enddddd");
	}
}

private void work()throws Exception {
	int n[]= {1,2,3};
	int a=4;
	try {
		System.out.println(a/n[a]);
		System.out.println(5/0);
	}catch(ArrayIndexOutOfBoundsException b)
	{
		throw b;
	}catch(ArithmeticException s)
	{
		throw s;
	}finally {
		System.out.println("end");
	}
	// TODO Auto-generated method stub
	
}
}
