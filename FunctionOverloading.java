class A
{
	void m1()
	{
		System.out.println("Method OverLoading");
	}
	void m1(int x)
	{
		System.out.println("Method OverLoaded"+x);
	}
	public static void main(String args[])
	{
		A obj = new A();
		obj.m1();
		obj.m1(10);
	}
}

