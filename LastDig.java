import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class LastDig{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no=s.nextInt();
		BigInteger n= new BigInteger(""+no);
		BigInteger two = new BigInteger("2");
		//long n= s.nextInt();
		int x,y,z;
		long sum=0;
		
		//BigInteger x;//y,z;
		//BigInteger y;
		//BigInteger z;
		//BigInteger sum = new BigInteger("0");
		
		for(int i=0;two.pow(i).intValue()<=n.intValue();i++){
			for(int j=0;j<=n.intValue();j++){
				x=two.pow(i).intValue();
				y=2*j;
				//long tmp =x+y;
				z= two.pow(x+y).intValue();
				sum=sum+z;
				System.out.println(" s: "+sum);
			}
		}
		System.out.println(sum+"  ");
	}
}

