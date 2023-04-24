package level_2;
import java.util.Scanner;

public class CyclicSumOfele_index {

	public static void main(String[] args) {
		System.out.println("sum of element*index then rotate cyclically and find sum again then add all the sums to find result");
		System.out.println("ex.{1,2,4}--->(1*0+2*1+4*2)+(4*0+1*1+2*2)+(2*0+4*1+1*2)--->total=21");
		System.out.println("--------------------------------------");
		
		Scanner sc= new Scanner(System.in);
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
		
		//------logic 1: find sum1 for array then shift array by one position then find sum2
		//-------------go on rotating for N-1 times the find all the N sums the add them
		
		
		
		//------logic 2: multiple=1+2+.....+(size-1)..then find sum of element*multiple for all elements
		int multiple=0;
		for(int i=1;i<size;i++)
		{
			multiple +=i;
		}
		
	//System.out.println("multiple: "+multiple);---------->to check if multiple is correct
		
		int total=0;
		for(int i=0;i<size;i++)
		{
			total +=arr[i]*multiple;
		}
		
		System.out.println("result: "+total);
		
		//-----------at the end of main-------------
     sc.close();
	}

}
