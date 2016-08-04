import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConv{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
		String hour = time.substring(0,2);
		String min = time.substring(3,5);
		String sec = time.substring(6,8);
		System.out.println(hour+ ":" + min+ ":" + sec);
		if(time.substring(8,10).equalsIgnoreCase("PM"))
		{
			if(Integer.parseInt(hour)<12)
			{
				int h=Integer.parseInt(hour);
				h+=12;
				hour = Integer.toString(h);
			}
			
		}
		if(time.substring(8,10).equalsIgnoreCase("AM"))
		{
			if (Integer.parseInt(hour) == 12) {
			hour = "00";
		  }
		}
		System.out.println(hour+ ":" + min+ ":" + sec);
	}
}
