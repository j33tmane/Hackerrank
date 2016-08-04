import java.io.*;
import java.util.*;

class Lucky{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int lsum=0;
		int rsum=0;
		for(int i=0;i<str.length()/2;i++)
		{
			lsum+=Integer.parseInt(str.charAt(i)+"");
		}
		if(str.length()%2!=0)
		{
			for(int i=str.length()/2+1;i<str.length();i++)
			{
				rsum+=Integer.parseInt(str.charAt(i)+"");
			}
		}
		else
		{
			for(int i=str.length()/2;i<str.length();i++)
			{
				rsum+=Integer.parseInt(str.charAt(i)+"");
			}
		}
				
		if(lsum==rsum)
		System.out.println("Lucky");
		else
		System.out.println("Not Lucky");
			
	}

}