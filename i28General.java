/*You have to develop one application for managing students and Teachers information. They have some common property, hence you have to
define a class Person. Design the application maintaing the hierarchy of classes. Override the toString method to print the values of an object.
The Students and Teachers information should be kept in array of objects*/
import java.util.*;
class Person
{
    String name;
    long phno;
    Person(String n,long ph)
    {
        this.name = n;
        this.phno = ph;
    }
   public void tostring()
    {
        System.out.println("Name:  "+this.name);
        System.out.println("Phone Number: "+this.phno);

    }

}
class Student extends Person
{
    int  roll;
    int rank;
    int grade;
    Student(int r,int R,int g,String nn,long phh)
    {
        super(nn,phh);
        this.roll = r;
        this.rank = R;
        this.grade = g;
    }
    
    public void tostring()
    {
        Person p = new Person(this.name,this.phno);
        p.tostring();
        System.out.println("Roll no: "+this.roll);
        System.out.println("Rank: "+this.rank);
        System.out.println("Grade: "+this.grade);

    }
}
class Teacher extends Person
{
    int exp;
    String qualf;
    Teacher(int e,String q,String jk,long fg)
    {
        super(jk,fg);
        this.exp = e;
        this.qualf = q;
    }
   public void tostring()
    {
        Person h = new Person(this.name,this.phno);
        h.tostring();
        System.out.println("Years of Experience "+this.exp);
        System.out.println("Degree:  "+this.qualf);

    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students and teachers: " );
        int n = sc.nextInt();
        int k = sc.nextInt();
        Student std[] = new Student[n];
        Teacher rcb[] = new Teacher[k];
        int rolll,Rankk,Gradee;
        String nnnn,Virata;
        long mn;
        Person obj;
         Person obj1;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details of Student no:"+(i+1));
            System.out.println("Enter the name: ");
            nnnn=sc.next();
            System.out.println("Enter  Roll: ");
            rolll=sc.nextInt();
            System.out.println("Enter Rank: ");
            Rankk=sc.nextInt();
            System.out.println("Enter Grade: ");
            Gradee=sc.nextInt();
            System.out.println("Enter Phn no: ");
            mn=sc.nextLong();
            std[i] = new Student(rolll,Rankk,Gradee,nnnn,mn);
        }
        for(int i=0;i<k;i++)
        {
            System.out.println("Enter details of Teacher no:"+(i+1));
            System.out.println("Enter the name: ");
            nnnn=sc.next();
            System.out.println("Enter  phno");
            mn=sc.nextLong();
            System.out.println("Enter years of experience: ");
            Gradee=sc.nextInt();
            System.out.println("Enter Qualification: ");
            Virata=sc.next();
            rcb[i] = new Teacher(Gradee,Virata,nnnn,mn);
        }
        // for(int i=0;i<n;i++)
        // { 
        //     System.out.println("Details of student: "+(i+1));
        //     obj=std[i];
        //     obj.toString();
        // }
        // for(int i=0;i<k;i++)
        // {
        //     System.out.println("Details of Teacher: "+(i+1));
        //     obj1=rcb[i];
        //     obj1.toString();
        // }

        System.out.println("Enter the Entry no of student for details: ");
        int y=sc.nextInt();
        Person obh = std[y-1];
        obh.tostring();
        System.out.println("Enter the Entry no of Teacher for details: ");
        int f=sc.nextInt();
        Person obh1 = rcb[f-1];
        obh1.tostring();
    }
}
