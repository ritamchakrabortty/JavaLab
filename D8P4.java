class a extends Thread
{
	public void run()
	{
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
		}
	
	}
	public static void main(String args[])
	{
		a ob = new a();
		ob.start();
		try
		{
			ob.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

}