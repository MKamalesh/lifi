package kamal;

public class RecReverse {

	public static void main(String[] args) {
		RecReverse rev=new RecReverse();
		rev.reverse(123);
		System.out.println(rv);
		// TODO Auto-generated method stub

	}
int r=0;
static int rv=0;
	private void reverse(int i) {
		if(i>0)
		{
		r=i%10;
		rv=(rv*10)+r;
		i=i/10;
		reverse(i);
		}
		// TODO Auto-generated method stub
		
	}

}
