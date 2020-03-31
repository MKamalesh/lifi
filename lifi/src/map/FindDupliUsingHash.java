package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public class FindDupliUsingHash {
public static void main(String[] args) {
	HashMap h=new HashMap();
	String s="kamal";
	char c[]=s.toCharArray();
	int j=0;
	char k = 0;
	for(int i=0;i<c.length;i++)
	{
		j=0;
	    k=c[i];
		if(h.get(c[i])!=null)
	    {
	    	j=(int) h.get(k);
	    }
	    j++;
	    h.put(k, j);
	}
	System.out.println(h);
Set a=h.keySet();
Iterator i=a.iterator();

System.out.println(a);
while(i.hasNext())
{
	Object o=i.next();
	int b=(int) h.get(o);
	if(b>1)
	{
		System.out.println(o);
	}
}

/*
 *iterate the set which as key 
 *pass that key into get method of h
 *check the value is greater than 1
 *if yes print that key
 * 
 */



	
}
}
