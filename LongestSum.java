import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class LongestSum{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		int no;
		int st=0;
		int en=0;
		for(int k=0;k<test;++k)
		{
			no = s.nextInt();
			int max= no;
			long sum[] = new long[no];
			sum[0]=s.nextLong();
			st = 0;
			en = 0;
			for(int j=1;j<no;++j){
				sum[j]=sum[j-1]+s.nextLong();
			}
			
			if(sum[no-1]%2!=0)
			{
				for(int i=0;i<no;++i)
				{
					if(sum[i]%2!=0)
					{
						st=no-i-1;
						break;
					}	

				}
				for(int j=no-1;j>=0;--j){
					if(sum[j]%2==0){
						en=j+1;
						break;
					}
				}
				if(st>en)
					System.out.println(st);
				else
					System.out.println(en);
			}
			else
				System.out.println(no);
		}	
		
	}
}