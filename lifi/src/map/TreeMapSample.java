package map;

import java.util.TreeMap;

public class TreeMapSample {
public static void main(String[] args) {
	TreeMap t=new TreeMap();
	String s="kamal";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		int j=0;
	    if(t.get(c[i])!=null)
	    {
	    	j=(int) t.get(c[i]);
	    }
	    j++;
	    t.put(c[i], j);
	}
	System.out.println(t);
}
}
