import java.text.ParseException;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Rle{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
		int len= str.length();
		char tmp ='0';
		int cnt=0;
		int l=0;
		char[] tmp1 = new char[1100000];
			for(int i=0;i<len;i++)
			{
				char c = str.charAt(i);
				int ascii = (int)c;
				int diff=ascii-64;
				for(int j=0;j<diff;j++){
					tmp1[l]=tmp;
					l++;
				}
				if(tmp=='0')
					tmp='!';
				else
					tmp='0';
				//l++;
			}
			for(int j=0;j<l;j++){
				if(j%57==0)
					System.out.println();
				System.out.print(tmp1[j]);
			}
				
	}
}

