import java.util.*;
interface Move
{
    public int score();
}
class Run implements Move
{
    public int score()
    {
        return 100;
    }
}
class Walk implements Move
{
    public int score()
    {
        return 50;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Run ob = new Run();
        Walk w = new Walk();
        int s = w.score()+ob.score();
        System.out.println("Total Score: "+s);
    }
}