import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

class Treemap{
	
	public static void main(String []args){
		
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		Integer val =null;
		String key =null;
		String arr[]= new String[t];
		int max =0;
		String win=null;
		for(int i=0;i<t;i++){
			arr[i]=s.next();
		}
		for(String i:arr){
			val = tm.get(i);
			if(val==null)
				val=0;
			val++;
			tm.put(i,val);
		}
		for(Map.Entry i:tm.entrySet()){
			val = Integer.parseInt(i.getValue()+"");
			System.out.println( i.getKey()+"   "+i.getValue());
			if(max<val)
			{
					max=val;
					win =i.getKey().toString();
			}		
		}
		System.out.println("Wiiner "+win);		
	}
}