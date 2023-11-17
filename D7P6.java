import java.util.*;
class NoMatchFoundException extends Exception 
{
    public NoMatchFoundException(String str)
    {
        super(str);
    }
}
class Demo
{
    public static void main(String[] args)
    {
        String s = "University";
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        try
        {
            if(s.compareTo(st)!=0)
            {
                throw new NoMatchFoundException("Entered string is not "+s);
            }
        }
        catch(NoMatchFoundException e)
        {
            System.out.println(e);
        }
    }
}