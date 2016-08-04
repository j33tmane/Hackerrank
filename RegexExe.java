import java.util.regex.*;  
import java.util.*;  

class RegexExe{  
		
		public static void main(String args[]){  
			Scanner s = new Scanner(System.in);
			
			System.out.println(Pattern.matches("[a-z]{1,}[@]{1}[a-z]*{1,}[.]{1}[a-z]*{1,}", s.next()));  
			//System.out.println(Pattern.matches("[a-zA-Z0-9]", s.next()));  
		
		}
		
}  