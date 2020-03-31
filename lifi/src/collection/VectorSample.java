package collection;

import java.util.Scanner;
import java.util.Vector;

public class VectorSample {
public static void main(String[] args) {
	Vector v=new Vector();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter number:");
		int a=sc.nextInt();
		
		System.out.println("Do you want to continue?");
		String s=sc.next();
		if(s.equals("yes"))
		{
			v.add(a);
			continue;
		}
		else {
			System.out.println(v);
			break;
		}
	}
	int max=Integer.MIN_VALUE;
	for(int i=0;i<v.size();i++)
	{
		if(max<(int)v.get(i))
		{
		  max=(int)v.get(i);
		}
	}
	System.out.println(max);
	//int m=(int)max;
	Integer i=max;
	v.remove(i);
	System.out.println(v);
}
}
