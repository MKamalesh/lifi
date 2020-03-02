package String;

public class VowelsCount {
public static void main(String[] args) {
	String vowel="kAmal";
	int len=vowel.length();
	char c[]=vowel.toCharArray();
	int count=0;
	for(int i=0;i<len;i++)
	{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
