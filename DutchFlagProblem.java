package level_1;
import java.util.Scanner;

public class DutchFlagProblem 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dutch flag problem:in array of 0s,1s and 2s..sort array in groups of 0s,1s and 2s");
		
		System.out.println("enter size of array");
		int size,s0=0,s1=0;
		size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("enter elements of array among 0,1,2");
		
		//----------accept array-----------------
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();	
		}
		//---------check if all elements are among 0,1,2
		boolean flag=true;
		
		for(int i=0;i<size;i++)
		{
			if((arr[i]!=0) && (arr[i]!=1) && (arr[i]!=2))
            {
				flag=false;
                break;
            }
				
		}
		
		if(flag==true)   //-----------do BL only when array is full of 0s,1s and 2s only
		{
		
			//-----------find no of 0s---->s0
			for(int i:arr)
			{
				if(i==0)
					s0++;
			}
			
			//-----------find no of 1s---->s1
			for(int i:arr)
			{
				if(i==1)
					s1++;
			}
			
			//-------no of 2s= size-(s0+s1)
			
			//-------rewrite array with groups of s0 no of 0s ,s1 no of 1s and remaining 2s
			
			for(int i=0;i<size;i++)
			{
				if(i<s0)
					arr[i]=0;
				else if(i<(s1+s0))
					arr[i]=1;
				else
					arr[i]=2;
					
			}
			for(int i:arr)
			{
				System.out.print(i+" ");
			}

		}        //-----------end of if
		else     
			System.out.println("ERROR:enter array contaning only 0s,1s and 2s");
	
	sc.close();
	       //-----------at the end of main----------------
	}

}
