package map;

import java.util.HashMap;

public class HashmapString {
public static void main(String[] args) {
	String s="computer";
	char c[]=s.toCharArray();
	HashMap h=new HashMap();
	int j=1;
	for(int i=0;i<c.length;i++)
	{
		h.put(j, c[i]);
		
		j++;
	}
	System.out.println(h);
	
}
}
