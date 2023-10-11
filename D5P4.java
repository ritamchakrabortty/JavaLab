import java.util.*;
class Person
{
    String name;
    long phno;
       
    void tostring()
    {
        System.out.println("Personal Details:\n");
        System.out.println("Name: "+this.name);
        System.out.println("Phone No: "+this.phno);
    }    

}
class Students extends Person
{
    int roll;
    int grade;
    int rank;
    
    void tostring()
    {
        System.out.println("Official Details:\n");
        System.out.println("Roll No: "+this.roll);
        System.out.println("Grade: "+this.grade);
        System.out.println("Rank: "+this.rank);
    
    }

}
class Teachers extends Person
{
    int yexp;
    String qualf;
    String pos;
    
    void tostring()
    {
        System.out.println("Official Details:\n");
        System.out.println("Years of experience: "+this.yexp);
        System.out.println("Qualification: "+this.qualf);
        System.out.println("Position: "+this.pos);
    
    }
    
}
class Main
{

    public static void main(String[]args)
    {
        int n,ns,nt;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students and teachers: ");
        ns = sc.nextInt();
        nt = sc.nextInt();
        Students sdn[] = new Students[ns];
        for(int i=0;i<ns;i++)
        {
            sdn[i]=new Students();
        }
        Teachers tcs[] = new Teachers[nt];
        for(int i=0;i<nt;i++)
        {
            tcs[i]=new Teachers();
        }
        System.out.println("Students Details:\n");
        for(int i=0;i<ns;i++)
        {
            System.out.print("Name: ");
            sdn[i].name=sc.next();
            System.out.println("Phone No. ");
            sdn[i].phno=sc.nextLong();
            System.out.println("Roll No: ");
            sdn[i].roll=sc.nextInt();
            System.out.println("Grade: ");
            sdn[i].grade=sc.nextInt();
            System.out.println("Rank: ");
            sdn[i].rank=sc.nextInt();
           
            
        }
        System.out.println("Teachers Details:\n");
        for(int i=0;i<nt;i++)
        {
            System.out.print("Name: ");
            tcs[i].name=sc.next();
            System.out.println("Phone No. ");
            tcs[i].phno=sc.nextLong();
            System.out.println("Years of Experience: ");
            tcs[i].yexp=sc.nextInt();
            System.out.println("Highest Qualification: ");
            tcs[i].qualf=sc.next();
            System.out.println("Position: ");
            tcs[i].pos=sc.next();
            System.out.println();
            
        }
        
        System.out.println("Enter the entry number of the teacher whose details you want to view ");
        n=sc.nextInt();
        Person ob = new Teachers();
        ob=tcs[n-1];
        ob.tostring();//method overriding
        tcs[n-1].tostring();
        
        System.out.println("Enter the entry number of the student whose details you want to view ");
        n=sc.nextInt();
        Person ob2 = new Students();
        ob=sdn[n-1];
        ob.tostring();//method overriding
        sdn[n-1].tostring();
    
    
    }


}