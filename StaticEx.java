class A
{
	static 
	{
		System.out.println("Static A ");
	}
}
class B extends A
{
	static 
	{
		System.out.println("Static B ");
	}
}
class C extends B
{
		static 
	{
		System.out.println("Static c ");
	}
}
class StaticEx extends C
{
	static 
	{
		System.out.println("Static Main ");
	}
	public static void main(String args[])
	{
		C obj =  new C();
	}
}
		
