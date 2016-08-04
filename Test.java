import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Test{
	
	public static void genFactorial() {
		BigInteger fact[] = new BigInteger[100001];
		fact[0]=new BigInteger("0");
		fact[1]=new BigInteger("1");
		   for(int j=2;j<=100000;++j){
			    fact[j] = fact[j-1].multiply(new BigInteger(j+"")).mod(new BigInteger("1000000007"));
				 System.out.println(fact[j]);
		   }  
	   
	}
	
	public static void main(String []args){
		genFactorial();
		//System.out.println(Arrays.toString(tmp));
	}
}