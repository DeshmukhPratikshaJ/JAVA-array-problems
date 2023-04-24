package level_1;
import java.util.Scanner;
public class PeakEle_grtrToNebr {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size;
		size=sc.nextInt();
		
		System.out.println("enter elements in the array");
		int[] arr=new int[size];
		
		//------------accept array----------
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//--------business logic---------check greater than neighbor elements (be careful for end elements)
		//-------------------------------and swap with peak if it is greater than peak
		
		int peak=0;
		for(int i=0;i<size;i++)
		{
		   if(i==0) 
		   {
			if((arr[i]>arr[i+1]) && (arr[i]>peak))
				peak=arr[i]; 
		   }
		   else if(i==(size-1))
		   {
			   if((arr[i]>arr[i-1]) && (arr[i]>peak))
					peak=arr[i];   
		   }
		   else
		   {
			   if((arr[i]>arr[i+1]) && (arr[i]>arr[i-1]) && (arr[i]>peak) )
				peak=arr[i]; 
		   }
		}
		
		System.out.println("peak element that is also greater to its adjacent neighbours is "+peak);
		
		
		
		//----------at the end main--------
		sc.close();
	}

}
