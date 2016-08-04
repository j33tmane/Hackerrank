import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class RamChoco{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no=s.nextInt();
		int arr[] = new int[no];
		int ans[] = new int[no];
		int sum=0;
		int ans_sum;
		for(int i=0;i<no;i++)
		{
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		ans[0]=arr[0];
		ans_sum=ans[0];
		for(int j=1;j<no;j++)
		{
			ans[j]=ans[j-1]+3;
			ans_sum+=ans[j];
		}			
		if(ans_sum==sum)
		{
			
		}
		else
			System.out.println("No");
		System.out.print(Arrays.toString(ans)+" "+sum+" "+ans_sum);
	}
}

