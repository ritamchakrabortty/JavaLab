import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        int x = Integer.valueOf(args[0]);
        int y = Integer.valueOf(args[1]);
        int z = Integer.valueOf(args[2]);
        int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println("The maximum is: " + max);
    }
}