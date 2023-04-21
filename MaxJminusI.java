import java.util.Scanner;

public class MaxJminusI
{
   public static void main (String[] args)
   {
      System.out.println("enter size of array thennn enter an array");
      Scanner sc=new Scanner(System.in);
      int size,difference=0;
      int[] arr=new int[10];
      
      size=sc.nextInt();

   //---------accept array----------------
      for(int i=0;i<size;i++)
      {
         arr[i]=sc.nextInt();
      }

  //-----------business logic--------------
     for(int i=0;i<=size-2;i++)
     {
    	 //System.out.println(i+"-"+arr[i]);
       for(int j=i+1;j<=size-1;j++)
       {
    	  // System.out.println(j+"-"+arr[j]);
         if(arr[i]<arr[j]) 
         {
        	 if(difference<(j-i))
          difference=j-i;
         }
       }
     }
  
 System.out.println("maximum j-i for arr[j]>arr[i] is "+difference);
    

//---------at the end of main--------------------- 
   }
}
