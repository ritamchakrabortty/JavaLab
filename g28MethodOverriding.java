import java.util.*;
class Dhiru
{

    int x;
    public Dhiru(int x)
    {
        this.x=x;
    }
    void test()
    {
        System.out.println("Adrija Biriyani khay");
        System.out.println("I am Dhiru");
    }
}
class Mukesh extends Dhiru
{
    int y;
    public Mukesh(int a,int b)
    {
        super(b);
        this.y=a;
    }
}
interface A 
{
    int g=15;
}
interface B 
{
    int z=20;
}
class Anant extends Mukesh implements A,B 
{
    int a=50;
    Anant(int j,int k)
    {
        super(j,k);
    }
    void sum()
    {
        System.out.println(a+x+y+z+g);
    }
    void test()
    {
        System.out.println("Adrija Biriyani khay ni baby corn khay");
        System.out.println("I am Anant");
    }
    public static void main(String[] args)
    {
        Anant a=new Anant(100,150);
        Dhiru ob = new Anant(100,150);
        a.sum();
        ob.test();

    }
        
}