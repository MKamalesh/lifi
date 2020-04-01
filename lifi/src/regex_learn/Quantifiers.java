package regex_learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
public static void main(String[] args) {
	String str="abaabbaaabbbabab";
	//quantifiers-number of occurences.
	//4 quantifiers-(+,*,?,{})
	//(+)-finds atleast one match to maximum of matches
	/*Pattern p=Pattern.compile("ab+");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}*/
	//(*)-finds any number of occurences including zero occurences
	/*Pattern p=Pattern.compile("a*");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}*/
	//(?)-finds the match separately 
	/*Pattern p=Pattern.compile("a?");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}*/
	//({number})-in below prgm,"a{2}" finds occurence of two a's.
	//({number,number})-if i give "a{1,3}" finds occurence of one 'a',two 'a',three 'a'.
	Pattern p=Pattern.compile("a{2}");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}
}
}
