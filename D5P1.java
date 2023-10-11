import java.util.*;
class dhiru
{
	int x= 100;
}
class mukesh extends dhiru
{
	int y =1000;
}
interface nita
{
	int p =500;
}
interface sidebussiness
{
	int q=50000;
}
class anant extends mukesh implements nita,sidebussiness
{
	int z =10000;
	void sum()
	{
		int total =x+y+z+p+q;
		System.out.println(total);
	}
	public static void main(String[]args)
	{	
		anant ob = new anant();
		ob.sum();
	}

}