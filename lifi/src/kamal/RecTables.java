package kamal;

public class RecTables {

	public static void main(String[] args) {
		RecTables t=new RecTables();
		t.mul();
	}
		int i=1,n=6,m;
		
		// TODO Auto-generated method stub

	private void mul() {
		m=n*i;
		if(i<=10)
		{
			System.out.println(m);
			i++;
			mul();
		}
		// TODO Auto-generated method stub
		
	}

}
