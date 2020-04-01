package regex_learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharClass {
public static void main(String[] args) {
	String str="Tamil Tamilan Tamilnadu 600000 !@#$%^&";
	//(\\s)-it prints spaces in the string.
	//(\\S)-it prints apart from spaces in the string.
	//(\\d)-it prints digits in the string.
	//(\\D)-it prints non-digits in the string.
	//(\\w)-it prints words(alphabets,numbers) except special characters in the string.
	//(\\W)-it prints only special characters including space in the string.
	//(\\bTamil)-'b' defines  for boundary,this statement prints wherever i have 'Tamil' in the string.
	//(\\bTamil\\b)-it defines that the word starts with 'Tamil' and ends with 'Tamil' in the string.
	//(Tamil\\B)-it prints the word starts with 'Tamil' but not ends with 'Tamil' in the string.
	//(\\GTamil)-here,'G' stands for 'Grouping'.it prints only the word starts with 'Tamil' and at the end of the word,again the word 'Tamil' continues
	//(".")-it prints all characters including special characters.
	Pattern p=Pattern.compile("\\s");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		System.out.println(m.group()+" starts at "+m.start());
	}
	
	
	
	
}
}
