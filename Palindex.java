import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindex {
	static boolean isPal(StringBuffer s) {
	  int n = s.length();
	  for (int i=0;i<(n / 2);++i) {
		 if (s.charAt(i) != s.charAt(n - i - 1)) {
			 return false;
			 //break;
		 }
	  }

	  return true;
	}

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
	   int test= s.nextInt();
		while(test!=0)
		{
			StringBuffer str = new StringBuffer(s.next());
			if(Palindex.isPal(str))
				System.out.println("-1");
			else
			{
				   for(int i=0;i<str.length()/2;i++)
				   {
					   if(str.charAt(i)!=str.charAt((str.length()-1)-i))
						{
							StringBuffer t = new StringBuffer(str).deleteCharAt(i);
							if(Palindex.isPal(t))
								System.out.println(i);
							else
								System.out.println((str.length()-1)-i);
						}
					}
					
			}
			test--;
		}
	}
	
}
