class A
{
	static void m1()
	{
		System.out.println("M1"); 
		m2();
	}
	/*
	STACK OVERFLOW EXCEPTION In That Exception The Stack Is Full coz It Stores fully.
	*/
	static void m2()
	{
		System.out.println("M2");
		m1();
	}
	public static void main(String args[])
	{
		m1();
	}
		
}
		
	