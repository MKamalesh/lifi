package regex_learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumValid {
public static void main(String[] args) throws FileNotFoundException {
	File file=new File("C:\\Users\\Jayaraman\\Desktop\\documents\\java\\text.txt");
	Scanner sc=new Scanner(file);
	boolean present=sc.hasNext();
	//String mobile="9876543210";
	while(present)
	{
		String str=sc.next();
		int index=str.lastIndexOf(":");
		String mobile=str.substring(index+1);
	Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher m=p.matcher(mobile);
	if(m.find())
	{
		System.out.println(m.group()+" is valid mobile number");
	}
	else {
		System.out.println(mobile+" is not valid");
	}
	 present=sc.hasNext();
	}
}
}
