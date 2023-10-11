import java.util.*;
class D4P5
{
    public static void main(String args[])
    {
    
        String s1 ="Hello@Good@World!";
        String[] s = s1.split("@",-2);
        for(String a: s)
        System.out.println(a);
        
        
    }
    
}
