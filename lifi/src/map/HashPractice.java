package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashPractice {
public static void main(String[] args) {
	HashMap h=new HashMap();
	h.put(1, "java");
	h.put(22, "php");
	h.put(8, "python");
	h.put(6,"perl");
	h.put(14, "dart");
	int max=Integer.MIN_VALUE;
for(Object o:h.keySet())
{
	if((int)o>max)
	{
		max=(int)o;
	}
}
System.out.println(max);
System.out.println(h.get(max));
}
}
