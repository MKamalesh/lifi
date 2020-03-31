package map;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeScanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList a=new ArrayList();
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		a.add(n);
	}
	for(int i=0;i<a.size();i++)
	{
		for(int j=i+1;j<a.size();j++)
		{
			int b=(int)a.get(i);
			int c=(int)a.get(j);
			if(b>c)
			{
				int temp=b;
				b=c;
				c=temp;
				a.set(i, b);
				a.set(j, c);
			}
		}
	}
	System.out.println(a);
	
}
}
