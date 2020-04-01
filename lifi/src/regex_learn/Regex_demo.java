package regex_learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_demo {
public static void main(String[] args) {
	String s="thupparku thuppaya thupparku thuppakki thupparku thooum mazhai";
	/*we cannot create object using new keyword in "Pattern" class,
	 * because this class has private constructor.
	 * compile method use to change the given expression into compiled expression
	 */
	Pattern p=Pattern.compile("thupparku");
	/*pattern class has matcher method. 
	 * here,we are matching the compiled expression with the given string
	 */
	Matcher m=p.matcher(s);
	/*"find()" method used to find whether the matching is found.
	 * find method is in "Matcher" class.so that,we are creating reference to matcher class.
	 */
	while(m.find())
	{
		/*start method is used to find the index where the expression starts*/
		System.out.println(m.group() +"starts at " +m.start());
	}
}
}
