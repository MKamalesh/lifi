package String;

public class OddCaps {
public static void main(String[] args) {
	String name="payilagam";
	String str=" ";
	int len=name.length();
	char c[]=name.toCharArray();
	for(int i=0;i<len;i++)
	{
		if(((c[i]>=97)&&(c[i]<=122))&&((i==0)||(i%2==0)))
		{
			c[i]=(char) (c[i]-32);
		}
	}
	for(int i=0;i<len;i++)
	{
		str=str+c[i];
	}
	System.out.println(str);
}
}
