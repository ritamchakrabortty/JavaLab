class Demo
{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        int nums[]=new int[5];
        try
        {
            j=18/i;

        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Arithmetic Exception has been tested");
        }
        try
        {
            System.out.println(nums[5]);
        }
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("Stay in your limit.....");
            f.printStackTrace();
        }
        finally
        {
            System.out.println("Array Index Out Of Bounds Exception has been tested");
        }

    }

}