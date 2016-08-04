import java.io.*;
import java.util.*;
public class Panagram{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String st ="abcdefghijklmnopqrstuvyzxw";
		String str = s.nextLine();
		String str1 =str.toLowerCase();
		boolean flg = true;
		for(int i=0;i<26;i++)
		{
			if(!str1.contains(st.substring(i,i+1)))
			{
				System.out.println("not pangram");
				flg=false;
				break;
			}	
		}
		if(flg==true)
			System.out.println("pangram");
		
	}
}