class c extends Thread
{
	public void run()
	{
		//System.out.println(Thread.currentThread().isDaemon());
		for(int i=1;i<=5;i++)
		System.out.println(i);
	}
}
class d extends c
{
	public static void main(String args[])
	{
		
		c ob = new c();
		ob.setDaemon(true);
		ob.start();
		for(int j=5;j>=1;j--)
		{
			System.out.println(j);
		}
	}
	

}