package kamal;

public class armstrong {

	public static void main(String[] args) {
		int x=321;
		int y;
		int a,b,c,d,e;
	a=x%10;
	b=a*a;
	x=x/10;
	c=x%10;
	d=c*c;
	x=x/10;
	e=x*x;
		y=b+d+e;
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
