package String;

public class Split {
public static void main(String[] args) {
	/*String st="If you think you can do it, you can do it";
	String s[]=st.split(" ");
	int len=s.length;
	int count[]=new int[len];
	int index=0;
	for(int i=0;i<len;i++)
	{
		int ct=0;
		char c[]=s[i].toCharArray();
		int l=c.length;
		for(int j=0;j<l;j++)
		{
			ct++;
		}
		count[i]=ct;
		
	}
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
		if(count[i]<count[j])
		{
		   index=j;
		}
		}
	}
	System.out.println(index);*/
	String K="If you can do it, you can do it";
	String s[]=K.split(" ");
	int max=0,index=0;
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()>max)
		{
			max=s[i].length();
			index=i;
		}
	}
	System.out.println(s[index]);
	
}
}
