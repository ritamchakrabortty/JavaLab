class n
{
	void display()
	{
		System.out.println(10/0);
	}
	public static void main(String args[])
	{
		n ob = new n();
		try
		{
			ob.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Abnvc");
	}

}