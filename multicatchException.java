class error
{
	public static void main(String args[])
	{
		int a[]={5,10};
		int b=5;
		try
		{
			int x = a[1]/(b-a[0]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArrayStoreException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
