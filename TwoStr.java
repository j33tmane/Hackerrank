import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStr{
    public static void main(String[] args)throws IOException {
		Scanner s = new Scanner(System.in);
		TreeSet<Character> ts = new TreeSet<Character>();
		TreeSet<Character> ts2 = new TreeSet<Character>();
		int test = s.nextInt();
		while(test!=0)
		{
			String str = s.next();
			String str2 = s.next();
			boolean flg=true;
			for(int i=0;i<str.length();i++){
				ts.add(str.charAt(i));
			}
			for(int i=0;i<str2.length();i++){
				ts2.add(str2.charAt(i));
			}
			 Iterator iterator;
			iterator = ts.iterator();
			while (iterator.hasNext()){
			   if(ts2.contains(iterator.next()))
			   {
				   System.out.println("YES"); 
				   flg=false;
					break;				   
			   }		    				
			}
			
			if(flg==true)
				 System.out.println("NO"); 
			test--;
			ts.clear();
			ts2.clear();
		}
		
	   }
}