package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkedListSample {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	LinkedList l=new LinkedList();
	a.add(1);
	a.add(2);
	a.add("java");
	a.add(true);
	a.add(5.8);
	a.add(1, 10);
	a.set(0, 9);	
	l.add(5);
	l.addAll(a);
	System.out.println(l);
}
}
