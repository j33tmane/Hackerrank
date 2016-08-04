import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Beauti{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		String findStr = "010";
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1){

			lastIndex = str.indexOf(findStr,lastIndex);
			
			if(lastIndex != -1){
				
				count ++;
			lastIndex+=3;
			}
			
		}
		System.out.println(count);
    }
}
