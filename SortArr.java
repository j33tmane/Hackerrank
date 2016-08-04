import java.util.*;
public class SortArr {
       
          static void partition(int[] ar) {
              int left[]= new int[500];
              int right[]= new int[500];
              int mid = ar[0];
              int l =0;
              int r=0;
              for(int i =1;i<ar.length;i++){
                  if(ar[i]<mid)
                      {
                      left[l]=ar[i];
                      l++;
                  } 
                  else{
                      right[r]=ar[i];
                      r++;
                  }
                      
              }
			   
			   printArray(left);
              printArray(right);
              
       }   
 
 static void printArray(int[] ar) {
         for(int i =0;i<ar.length;i++){
            System.out.print(""+ar[i]);
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
          
       }    
   }
