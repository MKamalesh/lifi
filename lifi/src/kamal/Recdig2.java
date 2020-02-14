package kamal;

public class Recdig2 {

	public static void main(String[] args) {
		Recdig2 rd=new Recdig2();
		rd.reverse(5);
		// TODO Auto-generated method stub

	}

	private int reverse(int i) {
		if(i<1)
		{
			return 1;
		}
		System.out.println(i);
		int j=reverse(i-1);
		return j;
		// TODO Auto-generated method stub
		
	}

}
