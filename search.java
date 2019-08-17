import java.util.*;

class search
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=s.nextInt();
		int i;
		int a[]=new int[100];
		System.out.println("Enter the values in the array :");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the number to be searched :");
		int key=s.nextInt();
		int pos=-1;
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Number found !");
				System.out.printf("Position = %d",i+1);
				pos=i+1;
			}
			
		}
		if(pos==-1)
			System.out.println("Not found !");
	}
}

