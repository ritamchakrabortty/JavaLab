class A implements Runnable
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
class B implements Runnable
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
class C implements Runnable
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
    Thread t1 = new Thread(ob1);
    B ob2 = new B();
    Thread t2 = new Thread(ob2);
    C ob3 = new C();
    Thread t3 = new Thread(ob3);
    t1.start();
    t2.start();
    t3.start();
  }

}
