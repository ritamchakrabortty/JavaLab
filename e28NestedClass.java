class StaticOuter
{
    int x = 5;
    static int y = 15;
    void test()
    {
        StaticInner jh = new StaticInner();
        jh.show();
    }
    static class StaticInner
    {
        void show()
        {
            System.out.println((new StaticOuter()).x);
            System.out.println(y);
        }
    }
}
class InnerOuter
{
    int x = 45;
    static int y = 115;
    void test()
    {
        Inner jh = new Inner();
        jh.show();
    }
    class Inner
    {
        void show()
        {
            System.out.println(x);
            System.out.println(InnerOuter.y);
        }
    }
}
class Demo
{
    public static void main(String[] args)
    {
        StaticOuter ob = new StaticOuter();
        InnerOuter ob1 = new InnerOuter();
        System.out.println("Static Inner class");
        ob.test();
        System.out.println("Non Static Inner class");
        ob1.test();
    }
}