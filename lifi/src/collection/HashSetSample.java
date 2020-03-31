package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(40);
	h.add(50);
	h.add(60);
	Iterator i=h.iterator(); //iterator is a method in hashset class and stores it as object i in Iterator class
	h.add(80);
	while(i.hasNext())//it checks whether the next object is present or not
	{
		System.out.println(i.next());
	}
}
}
