package String;

public class StringReplace {
public static void main(String[] args) {
	String K="If you can do it, you can do it";
	String s[]=K.split(" ");
	int len=s.length;
	for(int i=0;i<len;i++)
	{
		if(s[i].equalsIgnoreCase("do"))
		{
			s[i]="write";
		}
	}
	for(int i=0;i<len;i++)
	{
	System.out.print(s[i]+" ");
	}
}
}
