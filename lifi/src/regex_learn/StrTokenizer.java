package regex_learn;

import java.util.StringTokenizer;

public class StrTokenizer {
public static void main(String[] args) {
	//StringTokenizer str=new StringTokenizer("payilagam chennai");
	//StringTokenizer str=new StringTokenizer("01-01-1998","-");//this const. is used when i have to give the delimiter
	StringTokenizer str=new StringTokenizer("01-01-1998","-",true);//this const. prints the delimiter too.
	//in the string,it splits based on space because, it is called "DELIMITER" so
	//that the given string in argument is defaultly splits based on the space.
	//System.out.println(str.countTokens());//countTokens()-it counts no. of tokens in the string.
	while(str.hasMoreTokens())//this method checks atleast one token in the string,it returns boolean value
	{
		System.out.println(str.nextToken());//it prints the token and returns next token in the string
	}
}
}
