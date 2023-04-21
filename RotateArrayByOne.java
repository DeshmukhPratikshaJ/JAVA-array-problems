import java.util.*;
public class RotateArrayByOne {

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
		
   //------choose clockwise or anti-clockwise rotation-----
		
		char side;
		System.out.println("enter 'A' for anti-clockwise rotation and 'C' for clockwise");
		side=sc.next().charAt(0);     //------accept char value through scanner object
  
		
	//---------business logic----------
	    
		switch(side)
		{
		  case 'C':                  //clockwise rotation by one place
			  int temp=arr[size-1];  //---store last element in temp
			  
			  for(int i=size-1;i>=1;i--)
			  {
				arr[i]=arr[i-1];  
			  }
			  arr[0]=temp;          //----assign last value to 0th position
			  
			  for(int x:arr)        //-------print rotated array using for each loop
			  {
				  System.out.print(x+" ");        
			  }
			  System.out.println("");
			  
			break;
			
		  case 'A':                //anti-clockwise rotation by one  place
                
			  temp=arr[0];        //---store 0th element in temp
			  
			  for(int i=0;i<size-1;i++)
			  {
				arr[i]=arr[i+1];  
			  }
			  arr[size-1]=temp;          //----assign 0th value to last position
			  
			  for(int x:arr)       //-------print rotated array using for each loop
			  {
				  System.out.print(x+" ");        
			  }
			  System.out.println("");
			  break;
			  
		  default:
			  System.out.println("wrong input. enter either 'C' or 'A'");
			break;
		}
		
  //--------at the end of main-------
	}

}
