package map;

import java.util.HashMap;

public class HashMApString3 {
public static void main(String[] args) {
	String s="computer";
	char c[]=s.toCharArray();
	HashMap h=new HashMap();
	int j=1;
	for(int i=0;i<c.length;i++)
	{
		h.put(c[i], j);
		
		j++;
	}
	System.out.println(h);
}
}
