package listPrograms;

public class Prgm_26 {
public static void main(String[] args) {
	int n=1998,div=2;
	while(div<=n)
	{
	if(n%div==0)
	{
		System.out.println(div);
		break;
	}
	div++;
}
}
}
