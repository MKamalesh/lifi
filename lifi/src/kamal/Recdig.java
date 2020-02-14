package kamal;

public class Recdig {

	public static void main(String[] args) {
		Recdig rd=new Recdig();
		rd.onetofive(1);
		// TODO Auto-generated method stub

	}
	private int onetofive(int i) {
		if(i>5)
		{
		return 1;
		}
		System.out.println(i);
		int j=onetofive(i+1);
		return j;
		
		// TODO Auto-generated method stub
		
	}

}
