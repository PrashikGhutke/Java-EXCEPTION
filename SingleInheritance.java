class A
{
public void m1()
{
	System.out.println("Parent Class");
}
}
class B extends A{
	public void m2()
	{
		System.out.println("Child Class");
	}
}
class SingleInheritance{
	
	public static void main(String args[])
	{
	B obj =  new B();
	obj.m1();
	obj.m2();
}
}
