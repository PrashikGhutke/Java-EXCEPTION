/*
If THe Multiple CAtch Is There for One Exception then It executes only one CATCH Block 
*/
class UnCheckedException1
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
		try{
		m3();
		}
		catch(NullPointerException e )
		{
			System.out.println("CATCH BY MULTIPLE ONE");
		}
		System.out.println("M2");
		
	}
	static void m3()
	{
		System.out.println("M3 Before");
		UnCheckedException obj = null;
		System.out.println(obj.x);
		System.out.println("M3 ");
		
		
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
Main Before
M1 Before
M2 Before
M3 Before
CATCH BY MULTIPLE ONE
M2
M1
Main After
*/
