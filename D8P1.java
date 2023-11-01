//set thread name and get thread name

class a extends Thread
{
	public void run()
	{
		Thread.currentThread().setName("Ritam");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String tt[])
	{
		a ob = new a();
		ob.start();
	}

}