package level_2;
import java.util.Scanner;

public class CommonInThreeArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of first,second and third array");
		int s1,s2,s3;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		
		//------------accept arrays----------
		int[] arr1=new int[s1];
		int[] arr2=new int[s2];
		int[] arr3=new int[s3];
		
		System.out.println("enter elements in the first array(no duplicates)");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter elements in the second array(no duplicates)");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("enter elements in the third array(no duplicates)");
		for(int i=0;i<s3;i++)
		{
			arr3[i]=sc.nextInt();
		}
		
		//----------logic--find common element between arr1 and arr2 then only 
		//-----------------find that element in arr3..if it occurs then print
		
		System.out.println("common elements in all three arrays: ");
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				if(arr1[i]==arr2[j])    //--common between arr1 and arr2
				{
				  for(int k=0;k<s3;k++)
				  {
					  if(arr1[i]==arr3[k]) //-then only search for its occurrence in the 3rd
					  {
						 System.out.print(arr1[i]+" "); 
						 break;
					  }
				  }
				}
			}
		}
			
		
    //---------at the end of main-------------
		sc.close();
	}

}
