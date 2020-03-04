package String;

public class StringBufferPrgm {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("chennai430");
	int len=sb.length();
	char c[]=new char[len];
	String str=" ";
	for(int i=0;i<len;i++)
	{
		 c[i]=sb.charAt(i);
	}
	for(int i=0;i<len;i++)
	{
		if((c[i]>='0')&&(c[i]<='9'))
		{
			str=str+c[i];
		}
	}
	System.out.println(str);

}
}
