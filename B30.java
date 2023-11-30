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
  void test(int n)throws Exception
  {
    int z=n/0;
    System.out.println("The entered number "+n+" is valid");
  }
  public static void main(String args[])
  {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    B ob = new B();
    try
    {
      ob.test(n);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
