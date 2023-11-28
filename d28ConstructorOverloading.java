class Lab
{
    int a;
    float b;
    // int[] arr = new int[4];
    Lab()
    {
        a = 10;
        b = 2.5f;
    }
    Lab(int A, float B)
    {
        a=A;
        b=B;
    }
    Lab(Lab l)
    {
        a=l.a;
        b=l.b;
    }
    public static void main(String[] args)
    {
        Lab ob = new Lab();
        Lab ob1 = new  Lab(45,69.0f);
        Lab ob2 = new Lab(new Lab());
        System.out.print("OB: ");
        System.out.println("a = "+ob.a+"\t"+"b = "+ob.b);
        System.out.print("OB1: ");
        System.out.println("a = "+ob1.a+"\t"+"b = "+ob1.b);
        System.out.print("OB2: ");
        System.out.println("a = "+ob2.a+"\t"+"b = "+ob2.b);
    }

}