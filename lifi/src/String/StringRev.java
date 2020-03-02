package String;

public class StringRev {
	public static void main(String[] args) { 
		String name="kamal";
		int len=name.length();
		String rev=" ";
		char c[]=name.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
				}

}
