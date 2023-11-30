import java.util.*;
class A 
{
	synchronized void ab()
	{
	  Thread t = Thread.currentThread();
	  for(int i=0;i<100;i++)
	  {
	    try
	    {
	      System.out.println(t.getName());
	      Thread.sleep(5);
	    }
	    catch(Exception e)
	    {
	      System.out.println("ERROR!");
	    }
	    
	  }
	}
}
class Main
{
  public static void main(String args[])
  {
    final A obj = new A();
    Thread a = new Thread()
    {
      public void run()
      {
        obj.ab();
      }
    };
    Thread b = new Thread()
    {
      public void run()
      {
        obj.ab();
      }
    };
    a.setName("Thread A");
    b.setName("Thread B");
    a.start();
    b.start();
    
  }

}
