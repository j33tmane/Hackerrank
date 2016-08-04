import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funnystr{

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//StringBuffer str = new StringBuffer(s.nextLine());
		String tmp = s.next();
		StringBuffer rev = new StringBuffer(tmp).reverse();
		boolean flg = true;
		for(int i=1;i<tmp.length();i++)
		{
			System.out.println(tmp.codePointAt(i)-tmp.codePointAt(i-1));
			System.out.println(rev.codePointAt(i)-rev.codePointAt(i-1));
			if(Math.abs((tmp.codePointAt(i)-tmp.codePointAt(i-1)))!=Math.abs((rev.codePointAt(i)-rev.codePointAt(i-1))))
			{
				System.out.println("Not Funny");
				flg=false;
				break;
			}
		}
		if(flg==true)
		System.out.println("Funny");

	   }
}