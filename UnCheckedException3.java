class UnCheckedException3
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
	static void m4()
	{
		int a[] = { 1,2,3,4 } ;
		int b = a[4] ;
	}
	public static void main(String args[])
	{
		System.out.println("Main Before");		
		
		m1();
		System.out.println("Null Pointer After");
		System.out.println("ArrayIndexOutOfBoundsException Before");
		try{
		m4();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("WELCOME");
			}
		System.out.println("ARRAY After");
	}
}
		

	