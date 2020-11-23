package abs;
import java.util.Scanner;
public interface Ibook
{
	 public int daysOverdue(int day);
	 public boolean isOverdue(int due);
	 public void computeFine(int day);
}
   
class Refbook implements Ibook 
{
	String title;
	int daystaken;
	public Refbook(String title, int daystaken) 
	{
		super();
		this.title = title;
		this.daystaken = daystaken;
	}
	public int daysOverdue(int day)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter the date the book was taken");
		a=sc.nextInt();
		System.out.println("enter the date the book overdue");
		b=sc.nextInt();
		c=a-b;
		int c1=~c+1;
		if(c<0){
			return c;
		}
		else{
		return c1;
		
		}
		
	}
	public boolean isOverdue(int due)
	{
		if(due>0){
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public void computeFine(int day)
	{
		int d=daysOverdue(day);
		boolean status=isOverdue(d);
		int fine=0;
		
		int borrowdays=day-daystaken;
		if(status==true && borrowdays>2)
		{
			fine=d*10;
		}
		System.out.println("fine amount"+fine);
	}
	
}
class Book implements Ibook
{
	String title;
	String author;
	
	int daystaken;
	public Book(String title, String author,int daystaken) 
	{
		
		this.title = title;
		this.author = author;
		this.daystaken =daystaken;
	}
	
	public int daysOverdue(int day)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		a=14;
		System.out.println("enter the date the book overdue");
		b=sc.nextInt();
		c=a-b;
		int c1=~c+1;
		if(c<0){
			return c;
		}
		else{
		return c1;
		
		}
		
	}
	public boolean isOverdue(int due)
	{
		if(due>0){
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public void computeFine(int day)
	{
		int d=daysOverdue(day);
		boolean status=isOverdue(d);
		int fine=0;
		
		int borrowdays=day-daystaken;
		if(status==true && borrowdays>14)
		{
			fine=d*10;
		}
		System.out.println("fine amount"+fine);
	}
	
	
}
class Audiobook implements Ibook
{
	String title;
	String author;
	
	int daystaken;
	public Audiobook(String title, String author,int daystaken) 
	{
		
		this.title = title;
		this.author = author;
		this.daystaken =daystaken;
	}
	public int daysOverdue(int day)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		a=14;
		System.out.println("enter the date the book overdue");
		b=sc.nextInt();
		c=a-b;
		int c1=~c+1;
		if(c<0){
			return c;
		}
		else{
		return c1;
		
		}
		
	}
	public boolean isOverdue(int due)
	{
		if(due>0){
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public void computeFine(int day)
	{
		int d=daysOverdue(day);
		boolean status=isOverdue(d);
		int fine=0;
		
		int borrowdays=day-daystaken;
		if(status==true && borrowdays>14)
		{
			fine=d*10;
		}
		System.out.println("fine amount"+fine);
	}
	
}


