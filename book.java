import java.util.*;

class Book
{
	private String name;
	private String auther;
	private float price;
	private int num_pages;
	
	Book()
	{
	}

	public void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name of Book");
		name = s.nextLine();
		System.out.println("Enter Auther of Book");
		auther = s.nextLine();
		System.out.println("Enter Price of Book");
		price = s.nextFloat();
		System.out.println("Enter Number of pages of Book");
		num_pages = s.nextInt();
		System.out.println();
	}

	public void tostring2()
	{
		System.out.println("Name of Book = " + name);
		System.out.println("Auther of Book = " + auther);
		System.out.println("Price of Book = " + price);
		System.out.println("Number of pages of the Book = " + num_pages);
		System.out.println();
	}
}

class book
{
	public static void main(String args[])
	{
		Book b[] = new Book[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Books");
		int n = s.nextInt();
 		for(int i=0;i<n;i++)
		{
			b[i] = new Book();
			b[i].input();
		}
		
		for(int i=0;i<n;i++)
		{
			b[i].tostring2();
		}
	}
}
	
