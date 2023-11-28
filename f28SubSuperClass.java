import java.util.*;
class Dhiru
{

    int x;
    public Dhiru(int x)
    {
        this.x=x;
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
    public static void main(String[] args)
    {
        Anant a=new Anant(100,150);
        a.sum();

    }
        
}