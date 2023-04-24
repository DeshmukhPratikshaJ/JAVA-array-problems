package level_1;
import java.util.Scanner;

public class PushNegativeToRight {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size;
		size=sc.nextInt();
		
		System.out.println("enter elements of array whole numbers");
		int[] arr=new int[size];
		
		//------------accept array of integers----------
		
	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    //-------------business logic using swapping
	    int temp,last =0;
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=0;j<size;j++)
	    	{
	    		if(arr[j]<0)                //---swapping on finding negative number
	    		{
	    			temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    			break;
	    		}
	    		last=j;            //no negative number is left to b swapped when last element is reached
	    	}                      //so last=size so no need to iterate the outer loop
	    	if(last==size)         //so break away
	    		break;
	    }

	    //----------display sorted array-------
	    System.out.println("resulant array: ");
	    for(int i:arr)
	    {
	    	System.out.print(i+" ");
	    }
	    
	    //-----------at the end of main----------------
	    sc.close();
	}

}
