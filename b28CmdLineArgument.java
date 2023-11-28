//b28CmdLineArgument.java
class Demo1
{
    public static void main(String[] args)
    {
        System.out.println("My name is  ");
        String s = args[0]+" "+args[1];
        main(s);
    }
    public static void main(String args)
    {
        System.out.println(args);
    }
}