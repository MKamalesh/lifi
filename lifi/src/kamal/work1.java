package kamal;

public class work1 {

	public static void main(String[] args) {
		int age=-22;
		if(age>0 && age<=17)
		{
			System.out.println("minor");
		}
		else if(age>=18 && age<=60)
		{
			System.out.println("major");
		}
		else if(age>60)
		{
			System.out.println("senior citizen");
		}
		else if(age<0)
		{
			System.out.println("invalid age");
		}
		// TODO Auto-generated method stub

	}

}
