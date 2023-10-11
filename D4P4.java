import java.util.*;
class RepString
{

    public static void main(String[]args)
    {
    
        String os= " Monkey jumps high high , Cat says meow meow , Dogs bark Wuff wuff . ";
        StringTokenizer ob = new StringTokenizer(os," ");
        int n =ob.countTokens();
        String s;
        String[] ns = new String[n];
        int i=0,flag;
        System.out.println("The original string is: "+os);
        while(ob.hasMoreTokens())
        {
            s=ob.nextToken();
            flag=0;
            for(int j=0;j<i;j++)
            {                
                if(s.equalsIgnoreCase(ns[j])==true)
                    flag++;
                    
            }
            if(flag==0)
            {
                ns[i]=s;
                i++;
            }
            
        
        }
        n=i-1;
        String nstr=new String();
        for(i=0;i<n;i++)
            nstr+=" "+ns[i];
        System.out.println("The new string is: "+nstr);
    
    
    }



}