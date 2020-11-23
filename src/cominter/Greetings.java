package cominter;

public interface  Greetings 
{
   public void morning();
   public void afternoon();
   public void evening();
   public void night();
}
class English implements Greetings
{
	public void morning()
	{
		System.out.println("good morning");
	}
	public void afternoon()
	{
		System.out.println("good afternoon");
	}
	public void evening()
	{
		System.out.println("good evening");
	}
	public void night()
	{
		System.out.println("good night");
	}

	
}
class Hindi implements Greetings
{
	public void morning()
	{
		System.out.println("shubodaya");
	}
	public void afternoon()
	{
		System.out.println("subdopahar");
	}
	public void evening()
	{
		System.out.println("shubradhya");
	}
	public void night()
	{
		System.out.println("shubrathri");
	}
}
class Telugu implements Greetings
{
	public void morning()
	{
		System.out.println("namashkaram");
	}
	public void afternoon()
	{
		System.out.println("namashkaram");
	}
	public void evening()
	{
		System.out.println("namashkaram");
	}
	public void night()
	{
		System.out.println("namashkaram");
	}
}