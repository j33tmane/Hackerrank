import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
public class Test1 {
	public static void main(String[] args) {
		//HashMap<Integer, Integer> map = new HashMap<>();
		//int str[] = new int[1000000];
		
		Scanner s = new Scanner(System.in);
		int no;
		int cnt=s.nextInt();
		int cntans[]= new int[100];
		for(int i=0;i<cnt;++i)
		{
			no=s.nextInt();
			cntans[no]++;
			System.out.print("i="+i+" no="+no);
		}
		for(int i=0;i<100;++i)
			System.out.print(cntans[i]+" ");
	}
}