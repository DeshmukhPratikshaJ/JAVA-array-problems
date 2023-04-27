package extra;

import java.util.Scanner;

public class CyclicGrtstSum {

	public static int[] shiftByOne(int[] arr ,int size)
	{
		int temp=arr[size-1];  //---store last element in temp
		  
		  for(int i=size-1;i>=1;i--)
		  {
			arr[i]=arr[i-1];  
		  }
		  arr[0]=temp;        //---store temp to 1st element at 0th index
		return arr;
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);   //-----scanner object
		int size;
		System.out.println("enter size of array. ");
		size=sc.nextInt();
		
		int[] arr =new int[size];
		
		System.out.println("enter elements of array. ");
		
   //---------accept array--------
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int[] sum=new int[size];    //-----------array for sum
		for(int i=0;i<size;i++)
		{
			sum[i]=0;
			arr=shiftByOne(arr ,size);  //--------shift by 1 place
			for(int j=0;j<size;j++)
			{
			  sum[i]+=(arr[j]*j);      //calculate sum of all element*index	
			}
		}
		
		
		for(int i:sum)        //display array of sums
		{
		  System.out.print(i+" ");
		}
		System.out.println("");
		
		
		int grtSum=0;
		for(int i=0;i<size;i++)        //find highest sum
		{
		   if(sum[i]>grtSum)
			   grtSum=sum[i];
		}
		
		System.out.println("greatest sum: "+grtSum);
	//------------end of main----------------	
		
		sc.close();
	}

}
