package univer;

public class University 
{
	String name;
	static int noofclgs=60;
	University()
	{
		
	}
	public University(String name)
	{
		this.name=name;
	}
	public void disp()
	{
		System.out.println("name of universityis "+name);
	}
	public static void type()
	{
		System.out.println("type of university =state");
	}
	static class Electronics
	{
		String course="microcontroller";
		static int noofstudents=50;
	
	public void display()
	{
		System.out.println(course+"="+noofstudents);
		
	}
	public static void displaydept()
	{
		class Computerscience
		{
			String course="dbms";
			 final static int noofstudents=70;
		
		public void display()
		{
			System.out.println(course+"="+noofstudents);
	    }
	    }
		Computerscience cs=new Computerscience();
		cs.display();
		
      }
	}
	class Electrical
	{
		String course="machines";
		final static int noofstudents=80;
		public void displaydept()
		{
			System.out.println(course+"="+noofstudents);
		}
	}
}