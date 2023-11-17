import java.util.*;
class TooHot extends Exception
{
    public TooHot(String toohot)
    {
        super(toohot);
    }
}
class TooCold extends Exception
{
    public TooCold(String toocold)
    {
        super(toocold);
    }
}
class Demo
{


    public static void main(String[] args)
    {
        System.out.println("Enter the temparature in celcius: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        try
        {
            if(n>35)
                throw new TooHot("TooHot");
        }
        catch(TooHot e)
        {
            //e.printStackTrace();
            System.out.println(e);
        }
        try
        {
            if(n<=35)
                throw new TooCold("TooCold");
        }
        catch(TooCold f)
        {
            //f.printStackTrace();
            System.out.println(f);
        }


    }
}   