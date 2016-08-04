import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		Scanner s = new Scanner(System.in);
        String str = s.next();
		Integer val =null;
		boolean flg = true;
        for(int i=0;i<str.length();i++){
				val = tm.get(str.charAt(i));
				if(val==null)
					val=0;
				val++;
				tm.put(str.charAt(i),val);
		}
		for(Map.Entry i:tm.entrySet()){
			val =  Integer.parseInt(i.getValue()+"");
			if(val%2!=0)
			{
				System.out.print(i.getKey());
				flg=false;
			}	
		} 
       if(flg==true)
		   System.out.println("Empty String");
		 
	
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}