import java.io.*;
import java.util.*;
class ExtraSpace{
	public static void main(String []args){
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		str=str.trim();
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i)==' '&&sb.charAt(i+1)==' ')
			{
				sb.deleteCharAt(i+1);
				i--;
			}
			else if(sb.charAt(i)==' '&&(sb.charAt(i+1)=='.'||sb.charAt(i+1)==','||sb.charAt(i+1)=='?'))
				sb.deleteCharAt(i);
		}
		System.out.println(sb);
	}
}