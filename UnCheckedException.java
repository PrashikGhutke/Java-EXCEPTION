// UnCheckedException Occured at RUNTIME
class UnCheckedException
{
	int x =10;
	static void m1()
	{
		System.out.println("M1 Before");
		m2();
		System.out.println("M1 ");
		
	}
	static void m2()
	{
		System.out.println("M2 Before");
		m3();
		System.out.println("M2 Before");
		
	}
	static void m3()
	{
		System.out.println("M3 Before");
		UnCheckedException obj = null;
		System.out.println(obj.x);
		System.out.println("M3 Before");
		
		
	}
	public static void main(String args[])
	{
		System.out.println("Main Before");		
		try
		{
		m1();
		}
		catch(NullPointerException e)
		{
			System.out.println("CATCH");
		}
		System.out.println("Main After");
	}
}
		
/*
OUTPUT: 
C:\Users\DAC-29\Des
Main Before
M1 Before
M2 Before
M3 Before
CATCH
Main After

*/		
		
	