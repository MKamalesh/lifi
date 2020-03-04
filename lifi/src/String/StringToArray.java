package String;

public class StringToArray {
public static void main(String[] args) {
	String s="java";
	String l="program";
	char c[]=s.toCharArray();
	System.out.println(c[2]);
	int a=l.indexOf('g');
	System.out.println(a);
	char b=l.charAt(6);
	System.out.println(b);
	String d=l.substring(2,5);
	System.out.println(d);
	
}
}
