package String;

public class Dictionary {
public static void main(String[] args) {
	String s[]= {"abacus","aaa","bird","apple","cat","tiger","top","aeroplane","fish","python","php","perl"};
    int len=s.length;
    for(int i=0;i<len;i++)
    {
    	for(int j=i+1;j<len;j++)
    	{
    		if(s[i].compareTo(s[j])>0)
    		{
    			String temp=s[i];
    			s[i]=s[j];
    			s[j]=temp;
    		}
    	}
    }
    for(int i=0;i<len;i++)
    {
    	System.out.println(s[i]);
    }
    

}
}
