import java.io.*;
import java.util.*;

class Rotate{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String atoz="abcdefghijklmnopqrstuvwxyz";
		String str = s.next();
		//String str2 =s.next();
		//if()
		String str2 ="";
		for(int i=0;i<str.length();i++)
		{
			if(atoz.indexOf(str.charAt(i))<=13)
				str2+=atoz.charAt(atoz.indexOf(str.charAt(i))+14);
			else
				str2+=atoz.charAt(atoz.indexOf(str.charAt(i))%13);
		}
		
		
		System.out.println(str2);
	}

}