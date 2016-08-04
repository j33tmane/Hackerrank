import java.io.*;
import java.util.*;

class Factsum{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int fact=1;
		int factsum=0;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		Integer n = new Integer(fact);
		String str=n.toString();
		for(int i=0;i<str.length();i++)
		{
			factsum+=Integer.parseInt(str.charAt(i)+"");
		}
		System.out.println(fact+""+n+"   "+factsum);
	}

}