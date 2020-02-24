package listPrograms;

public class Prgm_27 {
public static void main(String[] args) {
	int n1=30,n2=18;
	int small=n1<n2?n1:n2;
	int big=n1>n2?n1:n2;
	while(small>2)
	{
		if((n1%small==0)&&(n2%small)==0)
		{
			System.out.println(small);
			break;
		}
		small--;
	}
}
}
