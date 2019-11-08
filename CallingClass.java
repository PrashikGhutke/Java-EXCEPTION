class CallingClass
{
	public static void main(String args[])
	{
		A a =  new A();
		a.x =10;
		a.m1();
		a.b = new B(); // Assing The Object 
		a.b.k = 20;
		a.b.m1();
		a.b.c = new C(); // Assing The Object 
		a.b.c.l =30;
		a.b.c.m1();
	}
}


class A 
{
	int x ;
	B b; // Reference Variable
	void m1()
	{
		System.out.println("Hello This Coder World" +x);
	}
}
class B
{
	int k;
	C c; // Reference Variable
	void m1()
	{
		System.out.println("Hello This  B Coder World="+k);
	}
}
class C 
{
 int l;
void m1()
	{
		System.out.println("Hello This Coder World="+l);
	}
}	