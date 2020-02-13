package kamal;

public class change {

	public static void main(String[] args) {
		int a=789;
		int b;
		int x=a%10;
		a=a/10;
		int y=a%10;
		a=a/10;
		b=(x*100)+(y*10)+a;
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
