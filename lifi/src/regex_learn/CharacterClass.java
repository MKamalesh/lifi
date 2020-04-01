package regex_learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass {
public static void main(String[] args) {
	String str="abcbcAcabaabBbccc123789";
	/*[ab]-it checks the string as either 'a' or 'b',so that only we are using square brackets.
	 */
	/*Pattern p=Pattern.compile("[ab]");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group());
	}*/
	/*[^ab]-if we use cap symbol inside the square bracket,it checks 
	 * apart from 'a' or 'b' what are the characters present in the string
	 */
	/*Pattern p=Pattern.compile("[^ab]");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group());
	}*/
	/*[a-z]-it checks alphabets in the string.
	 * [A-Z]-it checks for capital letters in string.
	 * [a-zA-Z]-it checks for capital and small letters in the string.
	 * [0-9]-it checks for only numbers in the string.
	 * [^a-zA-Z0-9]-it is used to check for special characters in the string.
	 */
	Pattern p=Pattern.compile("[a-z]");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}
}
}
