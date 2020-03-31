package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MapPractice {
public static void main(String[] args) {
	TreeMap t=new TreeMap();
	TreeMap t2=new TreeMap();
	t.put("name", "Ravi");
	t.put("mark", 80);
	t.put("grade", 'A');
	t2.put("name", "raja");
	t2.put("mark", 60);
	t2.put("grade", 'B');
	ArrayList a=new ArrayList();
	a.add(t);
	a.add(t2);
	System.out.println(a);
	
	for(int i=0;i<a.size();i++)
	{
		TreeMap t3=(TreeMap)a.get(i);
		for(Object o:t3.values())
		{
		System.out.println(o);
		}
	}
	
}
}
