package ExceptionHandling;

public class ThrowThrows {
public static void main(String[] args)  {
	ThrowThrows tt=new ThrowThrows();
	try {
		tt.work();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("end");
	}
}

private void work()throws Exception {
	try {
		System.out.println(5/0);
	}catch(Exception e)
	{
		throw e;
	}
	finally {
	System.out.println("end");
	}
	// TODO Auto-generated method stub
	
}
}
