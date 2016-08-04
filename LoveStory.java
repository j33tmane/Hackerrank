import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveStory{

    public static void main(String[] args) {
        String atoz ="abcdefghijklmnopqrstuvwxyz";
        Scanner s = new Scanner(System.in);
 		int count=0;
		int test = s.nextInt();
		while(test!=0)
		{
			StringBuffer str = new StringBuffer( s.next()); 
			for(int i=0;i<str.length()/2;i++)
			{
				if(str.charAt(i)!=str.charAt((str.length()-1)-i))
				{
					count+=Math.abs((atoz.indexOf(str.charAt(i)) - atoz.indexOf(str.charAt((str.length()-1)-i))));
						
				}
			}
		System.out.println(count);
		test--;
		count=0;
		}
	}
}