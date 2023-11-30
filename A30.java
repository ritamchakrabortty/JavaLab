import java.util.*;
class MyException extends Exception
{
  public MyException(String s)
  {
    super(s);
  }
}
class B
{
  public static void main(String args[])
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    try
    {
      if(n<10)
        throw new MyException("Entered number is INVALID!");
    }
    catch(MyException e)
    {
      System.out.println(e);
    }
    finally
    {
      System.out.println("MyException has been tested");
    }
    
  }
}
