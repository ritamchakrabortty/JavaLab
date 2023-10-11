import java.util.*;
class Sup
{
	void display()
	{
		System.out.println("Techno");	

	}
}
class Sub extends Sup
{
	void display()
	{
		System.out.println("International");	

	}
	void display2()
	{
		System.out.println("Newtown");	
	}

}
class mo 
{
	public static void main(String[] args)
	{
		
		Sup ob = new Sub();
		ob.display();
		Sub ob2 = new Sub();
		ob2.display2();
	}	
}