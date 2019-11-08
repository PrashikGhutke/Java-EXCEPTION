class StaticClass
{
	static int a = 10;
	int b = 20;
	public static void main(String args[])
	{
		System.out.println(a); // Static Variable is Created When class Is Loaded . It Stores in Method Area.
//		System.out.println(b); This IS NOt Allowed Because b is Not Created Memory Yet
		
		
		System.out.println(B.x); // Static Variable is invoked by using Class Name.
	
	}
}
class B
{
	static int x = 30;
//	System.out.println(StaticClass.a);
}