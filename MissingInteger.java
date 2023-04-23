package level_2;
import java.util.Scanner;
public class MissingInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size;
		System.out.println("enter size of integer array");
		size=sc.nextInt();
		
		System.out.println("enter unique numbers into array between 1 to "+(size+1));
		
		//----------accept array----------------
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//-----------find missing integer--------
		int flag;
		System.out.println("missing integer: ");
        for(int i=1;i<size+1;i++)
        { 
        	flag=0;
        	for(int j=0;j<size;j++)
        	{
        		if(i==arr[j])
        		{
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0)
        	{
        		System.out.print(i);
        		break;
        	}
        }
        System.out.println("");
		
		sc.close();   //-----------at the end of main-----------
	}

}
