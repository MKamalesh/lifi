package String;

public class equals {
public static void main(String[] args) {
	String s1=new String("java");
	String s2=new String("java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	String s3="python";
	String s4="python";
	System.out.println(s3==s4);
	System.out.println(s3.contentEquals(s4));
}
}
