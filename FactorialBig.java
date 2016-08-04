import java.math.BigInteger;
import java.util.Scanner;

class FactorialBig{

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       int n;
       while(t!=0)
       {
        	n = s.nextInt();
        	String fact = factorial(n);
       		System.out.println(fact);
			t--;
       }
      
   }

   public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
}