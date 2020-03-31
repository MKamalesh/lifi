package ExceptionHandling;

public class CheckPrgm {
public static void main(String[] args) {
	int a=2;
	CheckPrgm c=new CheckPrgm();
	try {
		a=c.getMark(5,0);
	}catch(Exception e)
	{
		try {
			a=c.getMark(5,a);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(a);
	}
	
	
}

private int getMark(int i, int j) throws Exception{
	try {
		return i/j;
	}catch(Exception e)
	{
		throw e;
	}finally {
	System.out.println(i+j);
	}
}
}
