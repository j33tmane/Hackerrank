import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternating{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		while(tc!=0){
			String str = in.next();
			int cnt = 0;
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(i+1)){
				   cnt++;
				}  
			
			}	
			System.out.println(cnt);
			cnt=0;
			tc--;
		}
	}
}
