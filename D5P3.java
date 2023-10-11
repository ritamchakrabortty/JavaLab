import java.util.*;
interface a
{
	int z=10;//all variables and methods declared under interface is public
	int score();//abstract method
}
class tint implements a
{
	public int score()
	{
		return 50;
	}
}
class iem implements a
{
	public int score()
	{
		return 100;
	}

}
class rp 
{
	public static void main(String aa[])
	{
		tint ob1=new tint();
		iem ob2=new iem();
		System.out.println("Total Score: "+(ob1.score()+ob2.score()));
	}	
}