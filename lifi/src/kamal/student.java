package kamal;

public class student {
	int mark1;
	int mark2;

	public student(int i, int j) {
		mark1=i;
		mark2=j;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		student siva=new student(90,80);
		siva.display();
		student kumar=new student(97,80);
		kumar.print();
		// TODO Auto-generated method stub

	}

	private void print() {
		System.out.println(mark1+" "+mark2);
		// TODO Auto-generated method stub
		
	}

	private void display() {
		System.out.println(mark1+" "+mark2);
		// TODO Auto-generated method stub
		
	}

}
