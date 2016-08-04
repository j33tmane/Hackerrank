
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Vitasum{

    private static int nCr2(int n, int r) {
		if (n == r || r == 0) {
			return 1;
		}
		double l = 1;
		if (n - r < r) {
			r = n - r;
		}
		for (int i = 0; i < r; i++) {
			l *= (n - i);
			l /= (i + 1);
		}
		return (int) (l % 1000000007);
	}
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int R =s.nextInt();
		int ans=0;
		for(int r=0;r<=R;r+=2)
			ans+=nCr2(N,r);
        System.out.println(ans);
    }
}

