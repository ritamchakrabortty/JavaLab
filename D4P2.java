import java.util.*;
class D4P2
{
    public static void main(String args[])
    {
    
        StringBuffer sb = new StringBuffer("Hello World!");
        String s=sb.toString();
        System.out.println("Length of string buffer object: "+sb.length());
        System.out.println("To print the string: "+s);
        sb.setLength(4);
        System.out.println("To reduce to first 4 characters "+sb);
        sb= new StringBuffer(s);
        sb.setCharAt(1,'o');        
        System.out.println("To place 'o' at index 1 "+sb);
        sb= new StringBuffer(s);
        sb.insert(6,"Good ");
        System.out.println("Inserting 'Good' in between 'Hello World' "+sb);
        System.out.println("To append: "+sb.append("I like Java"));
        
    }
    
}
