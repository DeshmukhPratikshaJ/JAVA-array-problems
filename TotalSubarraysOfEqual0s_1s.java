package level_2;
import java.util.Scanner;

public class TotalSubarraysOfEqual0s_1s 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//------------accept array contaning 0s and 1s----------
		
		System.out.println("enter size of array having only 0s and 1s");
		int size;
		size=sc.nextInt();
		
		System.out.println("enter elements in the array");
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//-------check if array has 0s and 1s only then implement logic-----
		boolean flag=true;
		for(int i=0;i<size;i++)
		{
			if((arr[i]!=0) && (arr[i])!=1)
			{
				flag=false;
				break;
			}
			else 
				flag=true;
		}
		//System.out.println(flag);
		
//------run logic for true------
		int s0=0,s1=0;       //s0=no of 0s ,   s1=no of 1s
		if(flag==true)
		{	
		    for(int i=0;i<size;i++)
		   {
			   if(arr[i]==0)
				    s0++;
			   else
				    s1++;
		   }
		    //System.out.println("s0="+s0+" s1="+s1);
		
		int totalSubarrays=0;
		if (s0<s1)
		{
			int i=1,subarray=1;
			while(subarray!=0)
			{
		     subarray=s0/i;
		     i++;
		     totalSubarrays+=subarray;
			}
		   
		}
		else
		{
			int i=1,subarray=1;
			while(subarray!=0)
			{
		     subarray=s1/i;
		     i++;
		     totalSubarrays+=subarray;
			}
			
		}
System.out.println("total subarrays of equal no 0f 0s and 1s: "+totalSubarrays);
		}
		else
			System.out.println("wrong array entered");
		
		//at the end of main
		sc.close();
	}

}
