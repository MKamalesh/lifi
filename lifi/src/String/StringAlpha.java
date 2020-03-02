package String;

public class StringAlpha {
public static void main(String[] args) {
	String name="payilagam";
	String str=" ";
	int len=name.length();
	char c[]=name.toCharArray();
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(c[i]>c[j])
			{
	      char temp=c[i];
	      c[i]=c[j];
	      c[j]=temp;
			}
	    }
	}
	for(int i=0;i<len;i++)
	{
		str=str+c[i];
	}
	System.out.println(str);
}
}
