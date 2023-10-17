class techno extends Exception
{
	techno(String y)
	{
		super(y);
	}
}
class b
{

	public static void main(String args[])
	{
		int x=12;
		try
		{
			if(x<18)
				throw new techno("less than 18");
			else
				System.out.println(x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

}