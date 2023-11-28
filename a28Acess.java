class Demo
{
     static 
    {
        System.out.println("KOLKATA");
    }
    static int x = 9;
    int a=5;
    int b=50;
    void check()
    {
        System.out.println("Hello everyone!"+" I am a nonstatic method");
        System.out.println(Demo.x );
        test();
    }
    void test()
    {
        Demo.another();
        System.out.println("Hello I am test a nonstatic method");
        
    }

    static void another()
    {
        System.out.println("Hellol I need the class name");
        System.out.println(x);

    }
    public static void main(String[] args)
    {
        Demo ob = new Demo();
        Demo ob1 = new Demo();
        int c = ob.a+ob.b;
        System.out.println(c);
        System.out.println(x);
        ob1.check();
        System.out.println(ob.x);
        System.out.println(ob1.x);
        ob.x=ob.x+5;
        System.out.println(ob.x);
        System.out.println(ob1.x);
        another();
        ob1.check();
    }
     static 
    {
        System.out.println("KOLKATAcccv");
    }

}