import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Arrange{
	
	
	
	public static void main(String []args){
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		Integer val =null;
		String str;
		BigInteger tmp;
		BigInteger npr;
		s.skip("[\r\n]+");
		BigInteger fact[] = new BigInteger[100001];
		fact[0]=new BigInteger("0");
		fact[1]=new BigInteger("1");
		   for(int j=2;j<=100000;++j){
			    fact[j] = fact[j-1].multiply(new BigInteger(j+"")).mod(new BigInteger("1000000007"));
				 //System.out.println(fact[j]);
		   }  
	
		for(int i=0;i<test;++i){
			tmp = new BigInteger("1");
			str = s.nextLine();
			for(int j=0;j<str.length();++j){
				val=tm.get(new Character(str.charAt(j)));
				if(val==null)
					val=0;
				val++;
				tm.put(new Character(str.charAt(j)),val);
			}
			int t;
			for(Map.Entry m:tm.entrySet()){  
				t = Integer.parseInt(m.getValue()+"");
				tmp=tmp.multiply(new BigInteger(fact[t]+""));
			} 
			npr=new BigInteger(fact[tm.size()]+"").multiply(tmp);
			System.out.println(npr.mod(new BigInteger("1000000007")));	
			tm.clear();
		}
	}
}