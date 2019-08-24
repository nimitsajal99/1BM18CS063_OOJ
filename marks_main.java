import java.util.*;

class student
{
	private String usn;
	private String name;
	private float sgpa;
	private int n;
	private int i;
	private int term;
	private int totalCredit;
	private int credit[] = new int[10];
	private int marks[] = new int[10];
	private int grade[] = new int[10];
	
	public void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name :");
		name = s.nextLine();
		System.out.println("Enter usn :");
		usn = s.nextLine();
		System.out.println("Enter number of subjects :");
		n = s.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter marks of subject " + (i+1) );
			marks[i] = s.nextInt();
			System.out.println("Enter credits of subject " + (i+1) );
			credit[i] = s.nextInt();	
		}
	}

	public void calculate()
	{
		for(i=0;i<n;i++)
		{
			if(marks[i]>90)
				grade[i]=10;
			else if(marks[i]>80 && marks[i]<=90)
				grade[i]=9;
			else if(marks[i]>70 && marks[i]<=80)
				grade[i]=8;
			else if(marks[i]>60 && marks[i]<=70)
				grade[i]=7;
			else if(marks[i]>50 && marks[i]<=60)
				grade[i]=6;
			else if(marks[i]>40 && marks[i]<=50)
				grade[i]=5;
			else if(marks[i]>30 && marks[i]<=40)
				grade[i]=4;
			else if(marks[i]>20 && marks[i]<=30)
				grade[i]=3;
			else if(marks[i]>10 && marks[i]<=20)
				grade[i]=2;
			else if(marks[i]>0 && marks[i]<=10)
				grade[i]=1;
		}	

		totalCredit=0;
		for(i=0;i<n;i++)
		{
			totalCredit+=credit[i];
		}

		term=0;
		for(i=0;i<n;i++)
		{
			term+=(grade[i]*credit[i]);
		}

		sgpa=(float)term/(float)totalCredit;
	}

	public void display()
	{
		System.out.println("Name = " + name );
		System.out.println("Usn = " + usn );
		System.out.println("SGPA = " + sgpa );
	}
}

class marks_main
{
	public static void main(String args[])
	{
		student a1 = new student();
		a1.input();
		a1.calculate();
		a1.display();
	}
}





