import java.util.Scanner;
public class KthLargestSmallest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size;
		size=sc.nextInt();
		
		System.out.println("enter array elements");
		int[] arr=new int[size];

	//------accept array------------
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}
   
   //----sorting array in descending order--------
		int temp,k;
		for(int i=0;i<size-1;i++)
		{
		  
		  for(int j=i+1;j<size;j++)
		  {
			  temp=arr[j];
		     if(arr[i]<arr[j])
		     {
		      arr[j]=arr[i];
		      arr[i]=temp; 
		     }
		   }
		}

 /* //-----printing sorted array----for our understanding		
		for(int i:arr)
		{
		  System.out.print(i+" ");
		}
		System.out.println("");
	*/
		
  //--------accept k---------
		System.out.println("enter k to know kth highest and smallest element");
		k=sc.nextInt();
		
  //--------print kth highest and smallest-----
		System.out.println("highest: "+arr[k-1]);
		System.out.println("smallest: "+arr[size-k]);
		sc.close();
	}

}
