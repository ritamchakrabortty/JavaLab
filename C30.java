class A extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
				System.out.println("This is A!");
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println("INVALID!");
			}
		
		}
	}

}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
				System.out.println("This is B!");
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println("INVALID!");
			}
		
		}
	}

}
class C extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
				System.out.println("This is C!");
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				System.out.println("INVALID!");
			}
		
		}
	}

}
class Main
{
  public static void main(String args[])
  {
    A ob1 = new A();
    B ob2 = new B();
    C ob3 = new C();
    ob1.start();
    ob2.start();
    ob3.start();
  }

}
