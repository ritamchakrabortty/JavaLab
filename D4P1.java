import java.util.*;
class D4P1
{
    public static void main(String args[])
    {
        
        String s = " Hello World ";
        String s2="Hello";
        char[] ch = new char[10]; 
        char[] ch2 = new char[10]; 
        System.out.println("The original string "+s);
        System.out.println("To get character at index 1: "+s.charAt(1));
        s.getChars(6,11,ch,0);
        System.out.println("To get characters between index 6 to 11: "+String.valueOf(ch));
        System.out.println("To remove whitespaces at the beginning and end: "+s.trim());
        ch2=s.toCharArray();
        System.out.println("To convert a string into character array and printing the second element of the array: "+ch2[1]);
        System.out.println("To find the first index of 'e' in the original string: "+s.indexOf('e'));
        System.out.println("To find the last index of 'l' in the original string: "+s.lastIndexOf('l'));
        System.out.println("To convert entire string to lower case: "+s.toLowerCase());
        System.out.println("To convert entire string to upper case: "+s.toUpperCase());
        System.out.println("To check whether 'Hello' and 'HELLO' are same by .equals: "+s2.equals("HELLO"));
        System.out.println("To check whether 'Hello' and 'HELLO' are same by .equalsIgnoreCase: "+s2.equalsIgnoreCase("HELLO"));
        System.out.println("To check whether 'Hello' and 'HELLO' are same by compareTo: "+s2.compareTo("HELLO"));
        System.out.println("To print from index 7 to the end: "+s.substring(7));
        System.out.println("To join two strings: "+s.concat(s2));
        System.out.println("To replace World with globe: "+s.replace("World","globe"));
    }
    
}
