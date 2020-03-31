package map;

import java.util.HashMap;

public class HashmapString2 {
public static void main(String[] args) {
	HashMap h=new HashMap();
	String s="kamal";
	char c[]=s.toCharArray();
	int j=1;
	for(int i=0;i<c.length;i++)
	{
		h.put(c[i],j);
		j++;
	}
	System.out.println(h.get(6));
}
}
