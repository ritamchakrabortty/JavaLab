import java.util.*;
class RepString
{

    public static void main(String[]args)
    {
    
        String os= " Monkey jumps high high Cat says meow meow Dogs bark Wuff wuff . ";
        StringTokenizer ob = new StringTokenizer(os," ");
        int n =ob.countTokens();
        String[] ns = new String[n];
        System.out.println("The original string is: "+os);
        int i=0,flag;
        while(ob.hasMoreTokens())
        {
            ns[i]= ob.nextToken();
            i++;
        }
        String s="";
        for(i=0;i<n;i++)
        {
            flag=0;
            if(ns[i].equals("")!=true)
            {
                s=ns[i];
                for(int j=0;j<n;j++)
                {
                    if(s.equalsIgnoreCase(ns[j]))
                    {
                        flag++;
                        ns[j]="";
                    }
                    
                }
                if(flag>1)
                {
                    System.out.println("The word: "+s+" is repeated "+flag+" times.");
                }
            }        
        }   
    }
}