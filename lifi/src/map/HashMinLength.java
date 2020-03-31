package map;

import java.util.HashMap;

public class HashMinLength {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put(1, "java");
	h.put(22, "php");
	h.put(8, "python");
	h.put(6,"perl");
	h.put(14, "dart");
	int min=Integer.MAX_VALUE;
	String t = null;
	for(Object o:h.values())
	{
		String s=(String) o.toString();
		String[] c=s.split(",");
		for(int i=0;i<c.length;i++)
		{
		
		if(c[i].length()<min) {
			min=c[i].length();
			
		}
		}
	}
	for(Object o:h.keySet())
	{
		String s=(String) h.get(o);
		int len=s.length();
		if(min==len)
		{
			System.out.println(o);
		}
	}
	System.out.println(min);
	System.out.println(t);
	
}
}
