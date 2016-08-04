import java.io.*;
import java.util.*;

class Runlen{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				cnt++;
				no=1;
			}	
			else
				str2+=atoz.charAt(atoz.indexOf(str.charAt(i))%13);
		}
		
		
		System.out.println(str2);
	}

}