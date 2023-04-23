package level_1;
import java.util.Scanner;

public class UnionIntersectionOf2Arrays {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  
	  //-------------accept size of both arrays---------
      System.out.println("enter size of first and second array[first array is always bigger]");
      int size1,size2;
      size1=sc.nextInt();
      size2=sc.nextInt();
      
      //----------accept both arrays----------
      int[] arr1=new int[size1];
      int[] arr2=new int[size2];
      
      System.out.println("enter elements of first array");
      for(int i=0;i<size1;i++)
      {
    	  arr1[i]=sc.nextInt();
      }
      
      System.out.println("enter elements of second array");
      for(int i=0;i<size2;i++)
      {
    	  arr2[i]=sc.nextInt();
      }
	
      //----------find intersection that is find common elements-------
      int[] result=new int[size1+size2];
      int numb=0;
      
                    //--------------intersection-----------
      System.out.println("intersection: ");
      
      for(int i=0;i<size1;i++)
      {
    	  for(int j=0;j<size2;j++)
    	  {
    		  if(arr1[i]==arr2[j])
    		  {
    			System.out.print(arr1[i]+" ");
    			break;
    		  }
    	  }
      }
      System.out.println("");
      
                  //-----------------union----------------
      
      for(int i=0;i<size1;i++)
      {
    	  result[numb]=arr1[i];
    	  numb++;
      }
      
      int traverse,flag=0;
      for(int j=0;j<size2;j++)
      {
    	  traverse=j;
    	  flag=0;
    	  for(int i=0;i<size1;i++)
	      {
	 	        if(result[i]==arr2[j]) 
	 	        {
	 	        	flag=1;
			       break;
	 	        }
	      } 
          if(flag==0)
          {
        	result[numb]=arr2[j];
        	numb++;
          }
      }
      
      System.out.println("union: ");
      for(int i=0;i<numb;i++)
      {
    	 
    	  System.out.print(i+" ");
      }
      System.out.println("");
     
    	  
      //-------------at the end of main------------------
      sc.close();
	}

}
