class b extends Thread
{
	//int s = 0;
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				Thread.sleep(4000);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
	public static void main(String args[])
	{
		b ob = new b();
		ob.start(); 
	}


}