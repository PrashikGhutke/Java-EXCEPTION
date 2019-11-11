class UnCheckedException2
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
		try
		{
		System.out.println(obj.x);
		}
		//catch(ArrayIndexOutOfBoundsException e) // IT SHOWS RUNTIME ERROR COZ THE EXCEPTION
		//TYPE is NullPointerException 
		catch(NullPointerException e)
		{
			System.out.println("Exception Catched");
		}
		System.out.println("M3 Before");
		
		
	}
	public static void main(String args[])
	{
		System.out.println("Main Before");		
		
		m1();
	

		System.out.println("Main After");
	}
}
/*
OUTPUT:

C:\Users\DAC-29\Desktop\
Main Before
M1 Before
M2 Before
M3 Before
Exception Catched
M3 Before
M2 Before
M1
Main After
*/
		

	