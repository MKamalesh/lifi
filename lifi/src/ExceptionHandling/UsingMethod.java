package ExceptionHandling;

public class UsingMethod {
public static void main(String[] args) {
	UsingMethod um=new UsingMethod();
	um.work();
}

private void work() {
	try {
		System.out.println(5/0);
	}catch(Exception e)
	{
		System.out.println("error");
	}
	System.out.println("end");
	// TODO Auto-generated method stub
	
}
}
