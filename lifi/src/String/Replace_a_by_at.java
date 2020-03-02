package String;

public class Replace_a_by_at {

	public static void main(String[] args) {
		String name="payilagam";
		int len=name.length();
		char c[]=name.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(c[i]=='a')
			{
				c[i]='@';
			}
		}
		String str=" ";
		for(int i=0;i<len;i++)
		{
			str=str+c[i];
		}
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}
