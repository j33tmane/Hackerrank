import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstone{

    public static void main(String[] args) {
        String atoz ="abcdefghijklmnopqrstuvwxyz";
        Scanner s = new Scanner(System.in);
 		int cnt=0;
		int gem=0;
		int test = s.nextInt();
		int tmp=test;
			String str[] = new String[test];
			for(int i=0;i<test;i++)
				str[i]=s.next();
			for(int j=0;j<26;j++)
			{
				cnt=0;	
				for(int k=0;k<test;k++)
				{
					if(str[k].contains(""+atoz.charAt(j)))
					{
						cnt++;
						System.out.println(atoz.charAt(j)+"  "+cnt);
					}
				}
				if(cnt==tmp)
				{
					gem++;
				}
					
			}
			System.out.println(gem);
		
	}
}