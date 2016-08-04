import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Anagram{
	
	public static void main(String []args){
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		TreeMap<Character,Integer> tm2 = new TreeMap<Character,Integer>();
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		while(test!=0){
			Integer val =null;
			String key =null;
			String str = s.next();
			int sum=0;
			if(str.length()%2!=0)
				System.out.println("-1");
			else
			{
				for(int i=0;i<str.length()/2;i++){
				val = tm.get(str.charAt(i));
				if(val==null)
					val=0;
				val++;
				tm.put(str.charAt(i),val);
				}
				for(int i=str.length()/2;i<str.length();i++){
					val = tm2.get(str.charAt(i));
					if(val==null)
						val=0;
					val++;
					tm2.put(str.charAt(i),val);
				}
				
				for(Map.Entry i:tm.entrySet()){
					
					
					val = Integer.parseInt(i.getValue()+"");
					if(tm2.containsKey(i.getKey()))
					{
						if(Integer.parseInt(i.getValue()+"")>tm2.get(i.getKey()))
							sum+=Math.abs(Integer.parseInt(i.getValue()+"")-tm2.get(i.getKey()));
					}
					else
						sum+=Integer.parseInt(i.getValue()+"");
							
				}
				System.out.println(sum);		
			}
			tm.clear();
			tm2.clear();
			test--;
			
		}
		
			
	}
}