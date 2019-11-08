class InstanceMethod
{
	int a = 10;
	/*
	static void a()
	{
			System.out.println(InstanceMethod.a); STATIC METHOD CANNOT ACCESS LOCAL VARIABVLES
	}*/
	void m1()
	{
			System.out.println(a);
	}
	public static void main(String args[])
	{
		InstanceMethod obj = new InstanceMethod();
		obj.m1();
	}
}