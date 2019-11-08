class StaticBlock
{
	public static void main(String args[])
	{
		System.out.println(A.a);
		System.out.println(A.b);
		A obj = new A();
		obj.m1();
	}	
}
class A
{
	static int a;
	static int b;
	
	static{ 
			System.out.println("Hello Coder");
		
			a = 20;
			b = 30;  //Static Block Is Used To Initailize The Static Variable.
		}
	void m1()
	{
		System.out.println("METHOD INVOKED");
		
		System.out.println(a); //INSEID the instance Method We Can call The Class Variable i.e. Static Variable
		System.out.println(b);
	}
}
		
		
